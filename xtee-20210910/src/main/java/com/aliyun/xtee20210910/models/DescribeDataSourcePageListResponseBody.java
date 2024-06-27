// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDataSourcePageListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeDataSourcePageListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeDataSourcePageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourcePageListResponseBody self = new DescribeDataSourcePageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourcePageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataSourcePageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataSourcePageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataSourcePageListResponseBody setResultObject(java.util.List<DescribeDataSourcePageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeDataSourcePageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeDataSourcePageListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeDataSourcePageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeDataSourcePageListResponseBodyResultObject extends TeaModel {
        @NameInMap("creator")
        public String creator;

        @NameInMap("description")
        public String description;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("modifier")
        public String modifier;

        @NameInMap("name")
        public String name;

        @NameInMap("total")
        public Long total;

        @NameInMap("type")
        public String type;

        public static DescribeDataSourcePageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSourcePageListResponseBodyResultObject self = new DescribeDataSourcePageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeDataSourcePageListResponseBodyResultObject setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeDataSourcePageListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDataSourcePageListResponseBodyResultObject setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDataSourcePageListResponseBodyResultObject setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDataSourcePageListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataSourcePageListResponseBodyResultObject setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public DescribeDataSourcePageListResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataSourcePageListResponseBodyResultObject setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeDataSourcePageListResponseBodyResultObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

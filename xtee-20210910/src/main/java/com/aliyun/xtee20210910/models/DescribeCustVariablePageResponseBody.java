// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeCustVariablePageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeCustVariablePageResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeCustVariablePageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustVariablePageResponseBody self = new DescribeCustVariablePageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustVariablePageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustVariablePageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCustVariablePageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCustVariablePageResponseBody setResultObject(java.util.List<DescribeCustVariablePageResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeCustVariablePageResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeCustVariablePageResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeCustVariablePageResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeCustVariablePageResponseBodyResultObject extends TeaModel {
        @NameInMap("dataVersion")
        public Long dataVersion;

        @NameInMap("description")
        public String description;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("title")
        public String title;

        public static DescribeCustVariablePageResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustVariablePageResponseBodyResultObject self = new DescribeCustVariablePageResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeCustVariablePageResponseBodyResultObject setDataVersion(Long dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }
        public Long getDataVersion() {
            return this.dataVersion;
        }

        public DescribeCustVariablePageResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCustVariablePageResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCustVariablePageResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCustVariablePageResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustVariablePageResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCustVariablePageResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}

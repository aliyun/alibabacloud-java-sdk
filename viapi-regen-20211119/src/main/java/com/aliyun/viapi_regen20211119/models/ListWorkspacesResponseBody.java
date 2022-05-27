// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListWorkspacesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponseBody setData(ListWorkspacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWorkspacesResponseBodyData getData() {
        return this.data;
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListWorkspacesResponseBodyDataElements extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static ListWorkspacesResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyDataElements self = new ListWorkspacesResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyDataElements setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkspacesResponseBodyDataElements setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListWorkspacesResponseBodyDataElements setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWorkspacesResponseBodyDataElements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkspacesResponseBodyDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListWorkspacesResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("Elements")
        public java.util.List<ListWorkspacesResponseBodyDataElements> elements;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static ListWorkspacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyData self = new ListWorkspacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public ListWorkspacesResponseBodyData setElements(java.util.List<ListWorkspacesResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<ListWorkspacesResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public ListWorkspacesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListWorkspacesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListWorkspacesResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}

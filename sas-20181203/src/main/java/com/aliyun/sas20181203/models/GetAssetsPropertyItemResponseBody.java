// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyItemResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public GetAssetsPropertyItemResponseBodyPageInfo pageInfo;

    @NameInMap("PropertyItems")
    public java.util.List<GetAssetsPropertyItemResponseBodyPropertyItems> propertyItems;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAssetsPropertyItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssetsPropertyItemResponseBody self = new GetAssetsPropertyItemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssetsPropertyItemResponseBody setPageInfo(GetAssetsPropertyItemResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetAssetsPropertyItemResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetAssetsPropertyItemResponseBody setPropertyItems(java.util.List<GetAssetsPropertyItemResponseBodyPropertyItems> propertyItems) {
        this.propertyItems = propertyItems;
        return this;
    }
    public java.util.List<GetAssetsPropertyItemResponseBodyPropertyItems> getPropertyItems() {
        return this.propertyItems;
    }

    public GetAssetsPropertyItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAssetsPropertyItemResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetAssetsPropertyItemResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAssetsPropertyItemResponseBodyPageInfo self = new GetAssetsPropertyItemResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetAssetsPropertyItemResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetAssetsPropertyItemResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetAssetsPropertyItemResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAssetsPropertyItemResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetAssetsPropertyItemResponseBodyPropertyItems extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("Path")
        public String path;

        public static GetAssetsPropertyItemResponseBodyPropertyItems build(java.util.Map<String, ?> map) throws Exception {
            GetAssetsPropertyItemResponseBodyPropertyItems self = new GetAssetsPropertyItemResponseBodyPropertyItems();
            return TeaModel.build(map, self);
        }

        public GetAssetsPropertyItemResponseBodyPropertyItems setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetAssetsPropertyItemResponseBodyPropertyItems setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetAssetsPropertyItemResponseBodyPropertyItems setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetAssetsPropertyItemResponseBodyPropertyItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}

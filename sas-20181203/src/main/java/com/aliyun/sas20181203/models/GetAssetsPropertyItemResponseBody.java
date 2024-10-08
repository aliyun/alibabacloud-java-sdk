// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyItemResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public GetAssetsPropertyItemResponseBodyPageInfo pageInfo;

    /**
     * <p>An array that consists of the aggregation information about asset fingerprints.</p>
     */
    @NameInMap("PropertyItems")
    public java.util.List<GetAssetsPropertyItemResponseBodyPropertyItems> propertyItems;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>340D7FC4-D575-1661-8ACD-CFA7BE57****</p>
     */
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
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
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
        /**
         * <p>The number of servers related to the asset fingerprints.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The endpoint.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>localhost</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The name of the module.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>lkm</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>alihids</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The path to the startup item.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>autorun</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>C:/Program Files/****</p>
         */
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

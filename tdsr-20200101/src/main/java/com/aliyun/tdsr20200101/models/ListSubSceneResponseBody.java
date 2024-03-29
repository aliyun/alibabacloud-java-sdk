// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListSubSceneResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Count")
    public Long count;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("HasNext")
    public Boolean hasNext;

    @NameInMap("List")
    public java.util.List<ListSubSceneResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalPage")
    public Long totalPage;

    public static ListSubSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubSceneResponseBody self = new ListSubSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubSceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListSubSceneResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListSubSceneResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListSubSceneResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public ListSubSceneResponseBody setList(java.util.List<ListSubSceneResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListSubSceneResponseBodyList> getList() {
        return this.list;
    }

    public ListSubSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSubSceneResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class ListSubSceneResponseBodyList extends TeaModel {
        @NameInMap("BaseImageUrl")
        public String baseImageUrl;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CubemapPath")
        public String cubemapPath;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("LayoutData")
        public String layoutData;

        @NameInMap("Name")
        public String name;

        @NameInMap("OriginUrl")
        public String originUrl;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static ListSubSceneResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListSubSceneResponseBodyList self = new ListSubSceneResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListSubSceneResponseBodyList setBaseImageUrl(String baseImageUrl) {
            this.baseImageUrl = baseImageUrl;
            return this;
        }
        public String getBaseImageUrl() {
            return this.baseImageUrl;
        }

        public ListSubSceneResponseBodyList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListSubSceneResponseBodyList setCubemapPath(String cubemapPath) {
            this.cubemapPath = cubemapPath;
            return this;
        }
        public String getCubemapPath() {
            return this.cubemapPath;
        }

        public ListSubSceneResponseBodyList setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListSubSceneResponseBodyList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSubSceneResponseBodyList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListSubSceneResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSubSceneResponseBodyList setLayoutData(String layoutData) {
            this.layoutData = layoutData;
            return this;
        }
        public String getLayoutData() {
            return this.layoutData;
        }

        public ListSubSceneResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSubSceneResponseBodyList setOriginUrl(String originUrl) {
            this.originUrl = originUrl;
            return this;
        }
        public String getOriginUrl() {
            return this.originUrl;
        }

        public ListSubSceneResponseBodyList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListSubSceneResponseBodyList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListSubSceneResponseBodyList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListSubSceneResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSubSceneResponseBodyList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}

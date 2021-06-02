// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListSubSceneResponseBody extends TeaModel {
    // 请求ID，与入参requestId对应
    @NameInMap("RequestId")
    public String requestId;

    // 返回码
    @NameInMap("Code")
    public Long code;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 是否有下一页
    @NameInMap("HasNext")
    public Boolean hasNext;

    // 当前页
    @NameInMap("CurrentPage")
    public Long currentPage;

    // 总页数
    @NameInMap("TotalPage")
    public Long totalPage;

    // 数据总条数
    @NameInMap("Count")
    public Long count;

    // 子场景列表集
    @NameInMap("List")
    public java.util.List<ListSubSceneResponseBodyList> list;

    public static ListSubSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubSceneResponseBody self = new ListSubSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubSceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListSubSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSubSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubSceneResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public ListSubSceneResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListSubSceneResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public ListSubSceneResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListSubSceneResponseBody setList(java.util.List<ListSubSceneResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListSubSceneResponseBodyList> getList() {
        return this.list;
    }

    public static class ListSubSceneResponseBodyList extends TeaModel {
        // 子场景ID
        @NameInMap("Id")
        public String id;

        // 子场景名称
        @NameInMap("Name")
        public String name;

        // 图片ID/视频ID
        @NameInMap("ResourceId")
        public String resourceId;

        // 图片路径/视频路径
        @NameInMap("Url")
        public String url;

        // 图片路径/视频封面路径
        @NameInMap("CoverUrl")
        public String coverUrl;

        // 子场景状态 1.未重建，      * 2.中间模型重建中，      * 3.中间模型重建完成，      * 4.待重建，      * 5.服务商重建中，      * 6.服务商重建完成，      * 7.已发布      * 8.发布中
        @NameInMap("Status")
        public Long status;

        // 创建时间
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        // 最后修改时间
        @NameInMap("GmtModified")
        public Long gmtModified;

        public static ListSubSceneResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListSubSceneResponseBodyList self = new ListSubSceneResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListSubSceneResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSubSceneResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSubSceneResponseBodyList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListSubSceneResponseBodyList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListSubSceneResponseBodyList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListSubSceneResponseBodyList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
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

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListSceneResponseBody extends TeaModel {
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

    // 数据总数
    @NameInMap("Count")
    public Long count;

    // 主场景数据
    @NameInMap("List")
    public java.util.List<ListSceneResponseBodyList> list;

    public static ListSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSceneResponseBody self = new ListSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSceneResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public ListSceneResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListSceneResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public ListSceneResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListSceneResponseBody setList(java.util.List<ListSceneResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListSceneResponseBodyList> getList() {
        return this.list;
    }

    public static class ListSceneResponseBodyList extends TeaModel {
        // 主场景Id
        @NameInMap("Id")
        public String id;

        // 场景名称
        @NameInMap("Name")
        public String name;

        // 场景类型 3D模型：MODEL_3D  全景图片：PIC  全景视频：VIDEO
        @NameInMap("Type")
        public String type;

        // 子场景数
        @NameInMap("SubSceneNum")
        public Long subSceneNum;

        // 资源数
        @NameInMap("SourceNum")
        public Long sourceNum;

        // 是否已发布 true：已发布：false：未发布
        @NameInMap("Published")
        public Boolean published;

        // 创建时间
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        // 最后修改时间
        @NameInMap("GmtModified")
        public Long gmtModified;

        // 预览Token
        @NameInMap("PreviewToken")
        public String previewToken;

        public static ListSceneResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListSceneResponseBodyList self = new ListSceneResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListSceneResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSceneResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSceneResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSceneResponseBodyList setSubSceneNum(Long subSceneNum) {
            this.subSceneNum = subSceneNum;
            return this;
        }
        public Long getSubSceneNum() {
            return this.subSceneNum;
        }

        public ListSceneResponseBodyList setSourceNum(Long sourceNum) {
            this.sourceNum = sourceNum;
            return this;
        }
        public Long getSourceNum() {
            return this.sourceNum;
        }

        public ListSceneResponseBodyList setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

        public ListSceneResponseBodyList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSceneResponseBodyList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListSceneResponseBodyList setPreviewToken(String previewToken) {
            this.previewToken = previewToken;
            return this;
        }
        public String getPreviewToken() {
            return this.previewToken;
        }

    }

}

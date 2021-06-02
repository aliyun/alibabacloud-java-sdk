// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListProjectResponseBody extends TeaModel {
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

    // count
    @NameInMap("Count")
    public Long count;

    // 项目数据
    @NameInMap("List")
    public java.util.List<ListProjectResponseBodyList> list;

    public static ListProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectResponseBody self = new ListProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public ListProjectResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListProjectResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public ListProjectResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListProjectResponseBody setList(java.util.List<ListProjectResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListProjectResponseBodyList> getList() {
        return this.list;
    }

    public static class ListProjectResponseBodyList extends TeaModel {
        // 项目ID
        @NameInMap("Id")
        public String id;

        // 项目名称
        @NameInMap("Name")
        public String name;

        // 业务ID
        @NameInMap("BusinessId")
        public Long businessId;

        // 业务名称
        @NameInMap("BusinessName")
        public String businessName;

        // 创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // 最后修改时间
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        // Token
        @NameInMap("Token")
        public String token;

        public static ListProjectResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectResponseBodyList self = new ListProjectResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListProjectResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectResponseBodyList setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public ListProjectResponseBodyList setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public ListProjectResponseBodyList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListProjectResponseBodyList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListProjectResponseBodyList setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}

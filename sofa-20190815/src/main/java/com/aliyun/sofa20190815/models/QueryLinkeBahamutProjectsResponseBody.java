// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutProjectsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<QueryLinkeBahamutProjectsResponseBodyResult> result;

    @NameInMap("Paginator")
    public QueryLinkeBahamutProjectsResponseBodyPaginator paginator;

    public static QueryLinkeBahamutProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutProjectsResponseBody self = new QueryLinkeBahamutProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutProjectsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutProjectsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutProjectsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutProjectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutProjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutProjectsResponseBody setResult(java.util.List<QueryLinkeBahamutProjectsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutProjectsResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryLinkeBahamutProjectsResponseBody setPaginator(QueryLinkeBahamutProjectsResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public QueryLinkeBahamutProjectsResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class QueryLinkeBahamutProjectsResponseBodyResultAdmins extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("StaffId")
        public String staffId;

        public static QueryLinkeBahamutProjectsResponseBodyResultAdmins build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutProjectsResponseBodyResultAdmins self = new QueryLinkeBahamutProjectsResponseBodyResultAdmins();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutProjectsResponseBodyResultAdmins setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutProjectsResponseBodyResultAdmins setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryLinkeBahamutProjectsResponseBodyResultAdmins setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public QueryLinkeBahamutProjectsResponseBodyResultAdmins setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }
        public String getStaffId() {
            return this.staffId;
        }

    }

    public static class QueryLinkeBahamutProjectsResponseBodyResultCreator extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("StaffId")
        public String staffId;

        public static QueryLinkeBahamutProjectsResponseBodyResultCreator build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutProjectsResponseBodyResultCreator self = new QueryLinkeBahamutProjectsResponseBodyResultCreator();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutProjectsResponseBodyResultCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutProjectsResponseBodyResultCreator setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryLinkeBahamutProjectsResponseBodyResultCreator setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public QueryLinkeBahamutProjectsResponseBodyResultCreator setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }
        public String getStaffId() {
            return this.staffId;
        }

    }

    public static class QueryLinkeBahamutProjectsResponseBodyResult extends TeaModel {
        @NameInMap("FullName")
        public String fullName;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdPath")
        public String idPath;

        @NameInMap("Link")
        public String link;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Admins")
        public java.util.List<QueryLinkeBahamutProjectsResponseBodyResultAdmins> admins;

        @NameInMap("Creator")
        public QueryLinkeBahamutProjectsResponseBodyResultCreator creator;

        public static QueryLinkeBahamutProjectsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutProjectsResponseBodyResult self = new QueryLinkeBahamutProjectsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutProjectsResponseBodyResult setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public QueryLinkeBahamutProjectsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutProjectsResponseBodyResult setIdPath(String idPath) {
            this.idPath = idPath;
            return this;
        }
        public String getIdPath() {
            return this.idPath;
        }

        public QueryLinkeBahamutProjectsResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public QueryLinkeBahamutProjectsResponseBodyResult setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public QueryLinkeBahamutProjectsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutProjectsResponseBodyResult setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryLinkeBahamutProjectsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeBahamutProjectsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLinkeBahamutProjectsResponseBodyResult setAdmins(java.util.List<QueryLinkeBahamutProjectsResponseBodyResultAdmins> admins) {
            this.admins = admins;
            return this;
        }
        public java.util.List<QueryLinkeBahamutProjectsResponseBodyResultAdmins> getAdmins() {
            return this.admins;
        }

        public QueryLinkeBahamutProjectsResponseBodyResult setCreator(QueryLinkeBahamutProjectsResponseBodyResultCreator creator) {
            this.creator = creator;
            return this;
        }
        public QueryLinkeBahamutProjectsResponseBodyResultCreator getCreator() {
            return this.creator;
        }

    }

    public static class QueryLinkeBahamutProjectsResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static QueryLinkeBahamutProjectsResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutProjectsResponseBodyPaginator self = new QueryLinkeBahamutProjectsResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutProjectsResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public QueryLinkeBahamutProjectsResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public QueryLinkeBahamutProjectsResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public QueryLinkeBahamutProjectsResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}

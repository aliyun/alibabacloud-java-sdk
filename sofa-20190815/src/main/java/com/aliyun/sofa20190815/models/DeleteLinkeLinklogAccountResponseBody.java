// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public DeleteLinkeLinklogAccountResponseBodyResult result;

    public static DeleteLinkeLinklogAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogAccountResponseBody self = new DeleteLinkeLinklogAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkeLinklogAccountResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkeLinklogAccountResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public DeleteLinkeLinklogAccountResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DeleteLinkeLinklogAccountResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public DeleteLinkeLinklogAccountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkeLinklogAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteLinkeLinklogAccountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteLinkeLinklogAccountResponseBody setResult(DeleteLinkeLinklogAccountResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteLinkeLinklogAccountResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteLinkeLinklogAccountResponseBodyResult extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("EndMills")
        public Long endMills;

        @NameInMap("End")
        public Long end;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("Stores")
        public java.util.List<String> stores;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("BeginMills")
        public Long beginMills;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("Sorter")
        public String sorter;

        @NameInMap("Begin")
        public Long begin;

        @NameInMap("StoreIds")
        public java.util.List<Long> storeIds;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Role")
        public Long role;

        @NameInMap("Id")
        public Long id;

        public static DeleteLinkeLinklogAccountResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteLinkeLinklogAccountResponseBodyResult self = new DeleteLinkeLinklogAccountResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setEndMills(Long endMills) {
            this.endMills = endMills;
            return this;
        }
        public Long getEndMills() {
            return this.endMills;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setStores(java.util.List<String> stores) {
            this.stores = stores;
            return this;
        }
        public java.util.List<String> getStores() {
            return this.stores;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setBeginMills(Long beginMills) {
            this.beginMills = beginMills;
            return this;
        }
        public Long getBeginMills() {
            return this.beginMills;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setSorter(String sorter) {
            this.sorter = sorter;
            return this;
        }
        public String getSorter() {
            return this.sorter;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setStoreIds(java.util.List<Long> storeIds) {
            this.storeIds = storeIds;
            return this;
        }
        public java.util.List<Long> getStoreIds() {
            return this.storeIds;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public DeleteLinkeLinklogAccountResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public UpdateLinkeLinklogAccountResponseBodyResult result;

    public static UpdateLinkeLinklogAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogAccountResponseBody self = new UpdateLinkeLinklogAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeLinklogAccountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeLinklogAccountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeLinklogAccountResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateLinkeLinklogAccountResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public UpdateLinkeLinklogAccountResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public UpdateLinkeLinklogAccountResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeLinklogAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeLinklogAccountResponseBody setResult(UpdateLinkeLinklogAccountResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateLinkeLinklogAccountResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateLinkeLinklogAccountResponseBodyResult extends TeaModel {
        @NameInMap("Begin")
        public Long begin;

        @NameInMap("BeginMills")
        public Long beginMills;

        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("End")
        public Long end;

        @NameInMap("EndMills")
        public Long endMills;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Role")
        public Long role;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("Sorter")
        public String sorter;

        @NameInMap("Stores")
        public java.util.List<String> stores;

        @NameInMap("StoreIds")
        public java.util.List<Long> storeIds;

        public static UpdateLinkeLinklogAccountResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeLinklogAccountResponseBodyResult self = new UpdateLinkeLinklogAccountResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setBeginMills(Long beginMills) {
            this.beginMills = beginMills;
            return this;
        }
        public Long getBeginMills() {
            return this.beginMills;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setEndMills(Long endMills) {
            this.endMills = endMills;
            return this;
        }
        public Long getEndMills() {
            return this.endMills;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setSorter(String sorter) {
            this.sorter = sorter;
            return this;
        }
        public String getSorter() {
            return this.sorter;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setStores(java.util.List<String> stores) {
            this.stores = stores;
            return this;
        }
        public java.util.List<String> getStores() {
            return this.stores;
        }

        public UpdateLinkeLinklogAccountResponseBodyResult setStoreIds(java.util.List<Long> storeIds) {
            this.storeIds = storeIds;
            return this;
        }
        public java.util.List<Long> getStoreIds() {
            return this.storeIds;
        }

    }

}

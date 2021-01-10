// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleasesResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutReleasesResponseBodyResult> result;

    @NameInMap("Paginator")
    public QueryLinkeBahamutReleasesResponseBodyPaginator paginator;

    public static QueryLinkeBahamutReleasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleasesResponseBody self = new QueryLinkeBahamutReleasesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutReleasesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutReleasesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutReleasesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutReleasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutReleasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutReleasesResponseBody setResult(java.util.List<QueryLinkeBahamutReleasesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutReleasesResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryLinkeBahamutReleasesResponseBody setPaginator(QueryLinkeBahamutReleasesResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public QueryLinkeBahamutReleasesResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class QueryLinkeBahamutReleasesResponseBodyResultManagers extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Customer")
        public String customer;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Department")
        public String department;

        @NameInMap("Email")
        public String email;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastLogin")
        public Long lastLogin;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("Ww")
        public String ww;

        @NameInMap("Tenants")
        public java.util.List<String> tenants;

        public static QueryLinkeBahamutReleasesResponseBodyResultManagers build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutReleasesResponseBodyResultManagers self = new QueryLinkeBahamutReleasesResponseBodyResultManagers();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setWw(String ww) {
            this.ww = ww;
            return this;
        }
        public String getWw() {
            return this.ww;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultManagers setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

    public static class QueryLinkeBahamutReleasesResponseBodyResultCreator extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Customer")
        public String customer;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Department")
        public String department;

        @NameInMap("Email")
        public String email;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastLogin")
        public Long lastLogin;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("Ww")
        public String ww;

        @NameInMap("Tenants")
        public java.util.List<String> tenants;

        public static QueryLinkeBahamutReleasesResponseBodyResultCreator build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutReleasesResponseBodyResultCreator self = new QueryLinkeBahamutReleasesResponseBodyResultCreator();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setWw(String ww) {
            this.ww = ww;
            return this;
        }
        public String getWw() {
            return this.ww;
        }

        public QueryLinkeBahamutReleasesResponseBodyResultCreator setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

    public static class QueryLinkeBahamutReleasesResponseBodyResult extends TeaModel {
        @NameInMap("AoneReleaseId")
        public String aoneReleaseId;

        @NameInMap("AppGroupName")
        public String appGroupName;

        @NameInMap("Created")
        public Long created;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReleaseDate")
        public Long releaseDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Managers")
        public java.util.List<QueryLinkeBahamutReleasesResponseBodyResultManagers> managers;

        @NameInMap("Creator")
        public QueryLinkeBahamutReleasesResponseBodyResultCreator creator;

        public static QueryLinkeBahamutReleasesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutReleasesResponseBodyResult self = new QueryLinkeBahamutReleasesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutReleasesResponseBodyResult setAoneReleaseId(String aoneReleaseId) {
            this.aoneReleaseId = aoneReleaseId;
            return this;
        }
        public String getAoneReleaseId() {
            return this.aoneReleaseId;
        }

        public QueryLinkeBahamutReleasesResponseBodyResult setAppGroupName(String appGroupName) {
            this.appGroupName = appGroupName;
            return this;
        }
        public String getAppGroupName() {
            return this.appGroupName;
        }

        public QueryLinkeBahamutReleasesResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public QueryLinkeBahamutReleasesResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public QueryLinkeBahamutReleasesResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutReleasesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutReleasesResponseBodyResult setReleaseDate(Long releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public Long getReleaseDate() {
            return this.releaseDate;
        }

        public QueryLinkeBahamutReleasesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeBahamutReleasesResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLinkeBahamutReleasesResponseBodyResult setManagers(java.util.List<QueryLinkeBahamutReleasesResponseBodyResultManagers> managers) {
            this.managers = managers;
            return this;
        }
        public java.util.List<QueryLinkeBahamutReleasesResponseBodyResultManagers> getManagers() {
            return this.managers;
        }

        public QueryLinkeBahamutReleasesResponseBodyResult setCreator(QueryLinkeBahamutReleasesResponseBodyResultCreator creator) {
            this.creator = creator;
            return this;
        }
        public QueryLinkeBahamutReleasesResponseBodyResultCreator getCreator() {
            return this.creator;
        }

    }

    public static class QueryLinkeBahamutReleasesResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static QueryLinkeBahamutReleasesResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutReleasesResponseBodyPaginator self = new QueryLinkeBahamutReleasesResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutReleasesResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public QueryLinkeBahamutReleasesResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public QueryLinkeBahamutReleasesResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public QueryLinkeBahamutReleasesResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}

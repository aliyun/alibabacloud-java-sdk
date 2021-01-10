// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Current")
    public Long current;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Data")
    public GetLinkelinkflowLinkflowAppResponseBodyData data;

    public static GetLinkelinkflowLinkflowAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowAppResponseBody self = new GetLinkelinkflowLinkflowAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkelinkflowLinkflowAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkelinkflowLinkflowAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkelinkflowLinkflowAppResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetLinkelinkflowLinkflowAppResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLinkelinkflowLinkflowAppResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkelinkflowLinkflowAppResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetLinkelinkflowLinkflowAppResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkelinkflowLinkflowAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkelinkflowLinkflowAppResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkelinkflowLinkflowAppResponseBody setData(GetLinkelinkflowLinkflowAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkelinkflowLinkflowAppResponseBodyData getData() {
        return this.data;
    }

    public static class GetLinkelinkflowLinkflowAppResponseBodyData extends TeaModel {
        @NameInMap("CnName")
        public String cnName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Level")
        public String level;

        @NameInMap("Members")
        public String members;

        @NameInMap("Name")
        public String name;

        @NameInMap("RepoUrl")
        public String repoUrl;

        @NameInMap("Tenant")
        public String tenant;

        public static GetLinkelinkflowLinkflowAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkelinkflowLinkflowAppResponseBodyData self = new GetLinkelinkflowLinkflowAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkelinkflowLinkflowAppResponseBodyData setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public GetLinkelinkflowLinkflowAppResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkelinkflowLinkflowAppResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetLinkelinkflowLinkflowAppResponseBodyData setMembers(String members) {
            this.members = members;
            return this;
        }
        public String getMembers() {
            return this.members;
        }

        public GetLinkelinkflowLinkflowAppResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkelinkflowLinkflowAppResponseBodyData setRepoUrl(String repoUrl) {
            this.repoUrl = repoUrl;
            return this;
        }
        public String getRepoUrl() {
            return this.repoUrl;
        }

        public GetLinkelinkflowLinkflowAppResponseBodyData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

    }

}

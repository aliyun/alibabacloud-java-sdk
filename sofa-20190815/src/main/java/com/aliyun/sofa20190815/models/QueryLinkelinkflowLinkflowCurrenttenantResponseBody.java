// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkelinkflowLinkflowCurrenttenantResponseBody extends TeaModel {
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
    public QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData data;

    public static QueryLinkelinkflowLinkflowCurrenttenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkelinkflowLinkflowCurrenttenantResponseBody self = new QueryLinkelinkflowLinkflowCurrenttenantResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkelinkflowLinkflowCurrenttenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkelinkflowLinkflowCurrenttenantResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkelinkflowLinkflowCurrenttenantResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkelinkflowLinkflowCurrenttenantResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryLinkelinkflowLinkflowCurrenttenantResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkelinkflowLinkflowCurrenttenantResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkelinkflowLinkflowCurrenttenantResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLinkelinkflowLinkflowCurrenttenantResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkelinkflowLinkflowCurrenttenantResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkelinkflowLinkflowCurrenttenantResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryLinkelinkflowLinkflowCurrenttenantResponseBody setData(QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Customer")
        public String customer;

        @NameInMap("Description")
        public String description;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Origin")
        public String origin;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("SiteId")
        public String siteId;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData self = new QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public QueryLinkelinkflowLinkflowCurrenttenantResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}

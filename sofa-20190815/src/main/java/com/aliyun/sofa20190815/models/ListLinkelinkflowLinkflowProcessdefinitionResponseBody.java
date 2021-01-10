// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkelinkflowLinkflowProcessdefinitionResponseBody extends TeaModel {
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
    public java.util.List<ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData> data;

    public static ListLinkelinkflowLinkflowProcessdefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkelinkflowLinkflowProcessdefinitionResponseBody self = new ListLinkelinkflowLinkflowProcessdefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkelinkflowLinkflowProcessdefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkelinkflowLinkflowProcessdefinitionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkelinkflowLinkflowProcessdefinitionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkelinkflowLinkflowProcessdefinitionResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListLinkelinkflowLinkflowProcessdefinitionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListLinkelinkflowLinkflowProcessdefinitionResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListLinkelinkflowLinkflowProcessdefinitionResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLinkelinkflowLinkflowProcessdefinitionResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkelinkflowLinkflowProcessdefinitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkelinkflowLinkflowProcessdefinitionResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListLinkelinkflowLinkflowProcessdefinitionResponseBody setData(java.util.List<ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData> getData() {
        return this.data;
    }

    public static class ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("StartFormKey")
        public Boolean startFormKey;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Version")
        public Long version;

        public static ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData self = new ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData setStartFormKey(Boolean startFormKey) {
            this.startFormKey = startFormKey;
            return this;
        }
        public Boolean getStartFormKey() {
            return this.startFormKey;
        }

        public ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListLinkelinkflowLinkflowProcessdefinitionResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}

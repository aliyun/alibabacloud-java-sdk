// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkelinkflowLinkflowAttachmentsResponseBody extends TeaModel {
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
    public java.util.List<ListLinkelinkflowLinkflowAttachmentsResponseBodyData> data;

    public static ListLinkelinkflowLinkflowAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkelinkflowLinkflowAttachmentsResponseBody self = new ListLinkelinkflowLinkflowAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkelinkflowLinkflowAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkelinkflowLinkflowAttachmentsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkelinkflowLinkflowAttachmentsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkelinkflowLinkflowAttachmentsResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListLinkelinkflowLinkflowAttachmentsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListLinkelinkflowLinkflowAttachmentsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListLinkelinkflowLinkflowAttachmentsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLinkelinkflowLinkflowAttachmentsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkelinkflowLinkflowAttachmentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkelinkflowLinkflowAttachmentsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListLinkelinkflowLinkflowAttachmentsResponseBody setData(java.util.List<ListLinkelinkflowLinkflowAttachmentsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLinkelinkflowLinkflowAttachmentsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListLinkelinkflowLinkflowAttachmentsResponseBodyData extends TeaModel {
        @NameInMap("Created")
        public Long created;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static ListLinkelinkflowLinkflowAttachmentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLinkelinkflowLinkflowAttachmentsResponseBodyData self = new ListLinkelinkflowLinkflowAttachmentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLinkelinkflowLinkflowAttachmentsResponseBodyData setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkelinkflowLinkflowAttachmentsResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListLinkelinkflowLinkflowAttachmentsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLinkelinkflowLinkflowAttachmentsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkelinkflowLinkflowAttachmentsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkelinkflowLinkflowAttachmentsResponseBodyData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public ListLinkelinkflowLinkflowAttachmentsResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListLinkelinkflowLinkflowAttachmentsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLinkelinkflowLinkflowAttachmentsResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}

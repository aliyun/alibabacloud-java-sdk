// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkelinkflowLinkflowAttachmentsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Total")
    public Long total;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Data")
    public CreateLinkelinkflowLinkflowAttachmentsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Current")
    public Long current;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkelinkflowLinkflowAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkelinkflowLinkflowAttachmentsResponseBody self = new CreateLinkelinkflowLinkflowAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkelinkflowLinkflowAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkelinkflowLinkflowAttachmentsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public CreateLinkelinkflowLinkflowAttachmentsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkelinkflowLinkflowAttachmentsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public CreateLinkelinkflowLinkflowAttachmentsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateLinkelinkflowLinkflowAttachmentsResponseBody setData(CreateLinkelinkflowLinkflowAttachmentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLinkelinkflowLinkflowAttachmentsResponseBodyData getData() {
        return this.data;
    }

    public CreateLinkelinkflowLinkflowAttachmentsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateLinkelinkflowLinkflowAttachmentsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkelinkflowLinkflowAttachmentsResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public CreateLinkelinkflowLinkflowAttachmentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLinkelinkflowLinkflowAttachmentsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkelinkflowLinkflowAttachmentsResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Description")
        public String description;

        @NameInMap("Url")
        public String url;

        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Created")
        public Long created;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Creator")
        public String creator;

        public static CreateLinkelinkflowLinkflowAttachmentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkelinkflowLinkflowAttachmentsResponseBodyData self = new CreateLinkelinkflowLinkflowAttachmentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLinkelinkflowLinkflowAttachmentsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateLinkelinkflowLinkflowAttachmentsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLinkelinkflowLinkflowAttachmentsResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateLinkelinkflowLinkflowAttachmentsResponseBodyData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public CreateLinkelinkflowLinkflowAttachmentsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkelinkflowLinkflowAttachmentsResponseBodyData setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public CreateLinkelinkflowLinkflowAttachmentsResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateLinkelinkflowLinkflowAttachmentsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateLinkelinkflowLinkflowAttachmentsResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinklogKnowledgeResponseBody extends TeaModel {
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
    public CreateLinkeLinklogKnowledgeResponseBodyResult result;

    public static CreateLinkeLinklogKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinklogKnowledgeResponseBody self = new CreateLinkeLinklogKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinklogKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeLinklogKnowledgeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeLinklogKnowledgeResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public CreateLinkeLinklogKnowledgeResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateLinkeLinklogKnowledgeResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public CreateLinkeLinklogKnowledgeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeLinklogKnowledgeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLinkeLinklogKnowledgeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLinkeLinklogKnowledgeResponseBody setResult(CreateLinkeLinklogKnowledgeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateLinkeLinklogKnowledgeResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateLinkeLinklogKnowledgeResponseBodyResult extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("EndMills")
        public Long endMills;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("End")
        public Long end;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("BeginMills")
        public Long beginMills;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Indications")
        public java.util.List<String> indications;

        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("Sorter")
        public String sorter;

        @NameInMap("Description")
        public String description;

        @NameInMap("Begin")
        public Long begin;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("HookApi")
        public String hookApi;

        @NameInMap("LinkUrl")
        public String linkUrl;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Solution")
        public String solution;

        @NameInMap("Name")
        public String name;

        @NameInMap("PriorityType")
        public String priorityType;

        @NameInMap("Id")
        public Long id;

        public static CreateLinkeLinklogKnowledgeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeLinklogKnowledgeResponseBodyResult self = new CreateLinkeLinklogKnowledgeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setEndMills(Long endMills) {
            this.endMills = endMills;
            return this;
        }
        public Long getEndMills() {
            return this.endMills;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setBeginMills(Long beginMills) {
            this.beginMills = beginMills;
            return this;
        }
        public Long getBeginMills() {
            return this.beginMills;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setIndications(java.util.List<String> indications) {
            this.indications = indications;
            return this;
        }
        public java.util.List<String> getIndications() {
            return this.indications;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setSorter(String sorter) {
            this.sorter = sorter;
            return this;
        }
        public String getSorter() {
            return this.sorter;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setHookApi(String hookApi) {
            this.hookApi = hookApi;
            return this;
        }
        public String getHookApi() {
            return this.hookApi;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
            return this;
        }
        public String getLinkUrl() {
            return this.linkUrl;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setPriorityType(String priorityType) {
            this.priorityType = priorityType;
            return this;
        }
        public String getPriorityType() {
            return this.priorityType;
        }

        public CreateLinkeLinklogKnowledgeResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogKnowledgeResponseBody extends TeaModel {
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
    public GetLinkeLinklogKnowledgeResponseBodyResult result;

    public static GetLinkeLinklogKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogKnowledgeResponseBody self = new GetLinkeLinklogKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinklogKnowledgeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinklogKnowledgeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinklogKnowledgeResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkeLinklogKnowledgeResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public GetLinkeLinklogKnowledgeResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public GetLinkeLinklogKnowledgeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinklogKnowledgeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinklogKnowledgeResponseBody setResult(GetLinkeLinklogKnowledgeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeLinklogKnowledgeResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeLinklogKnowledgeResponseBodyResult extends TeaModel {
        @NameInMap("Begin")
        public Long begin;

        @NameInMap("BeginMills")
        public Long beginMills;

        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("Description")
        public String description;

        @NameInMap("End")
        public Long end;

        @NameInMap("EndMills")
        public Long endMills;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("HookApi")
        public String hookApi;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LinkUrl")
        public String linkUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("PriorityType")
        public String priorityType;

        @NameInMap("Solution")
        public String solution;

        @NameInMap("Sorter")
        public String sorter;

        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("Indications")
        public java.util.List<String> indications;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static GetLinkeLinklogKnowledgeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinklogKnowledgeResponseBodyResult self = new GetLinkeLinklogKnowledgeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setBeginMills(Long beginMills) {
            this.beginMills = beginMills;
            return this;
        }
        public Long getBeginMills() {
            return this.beginMills;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setEndMills(Long endMills) {
            this.endMills = endMills;
            return this;
        }
        public Long getEndMills() {
            return this.endMills;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setHookApi(String hookApi) {
            this.hookApi = hookApi;
            return this;
        }
        public String getHookApi() {
            return this.hookApi;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
            return this;
        }
        public String getLinkUrl() {
            return this.linkUrl;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setPriorityType(String priorityType) {
            this.priorityType = priorityType;
            return this;
        }
        public String getPriorityType() {
            return this.priorityType;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setSorter(String sorter) {
            this.sorter = sorter;
            return this;
        }
        public String getSorter() {
            return this.sorter;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setIndications(java.util.List<String> indications) {
            this.indications = indications;
            return this;
        }
        public java.util.List<String> getIndications() {
            return this.indications;
        }

        public GetLinkeLinklogKnowledgeResponseBodyResult setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

}

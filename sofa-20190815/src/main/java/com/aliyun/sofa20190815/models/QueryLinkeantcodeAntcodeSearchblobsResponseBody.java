// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeSearchblobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Amount")
    public Long amount;

    @NameInMap("EmptyPage")
    public Boolean emptyPage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Total")
    public Long total;

    @NameInMap("List")
    public java.util.List<QueryLinkeantcodeAntcodeSearchblobsResponseBodyList> list;

    public static QueryLinkeantcodeAntcodeSearchblobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeSearchblobsResponseBody self = new QueryLinkeantcodeAntcodeSearchblobsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeSearchblobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeSearchblobsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeSearchblobsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeSearchblobsResponseBody setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public QueryLinkeantcodeAntcodeSearchblobsResponseBody setEmptyPage(Boolean emptyPage) {
        this.emptyPage = emptyPage;
        return this;
    }
    public Boolean getEmptyPage() {
        return this.emptyPage;
    }

    public QueryLinkeantcodeAntcodeSearchblobsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeSearchblobsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryLinkeantcodeAntcodeSearchblobsResponseBody setList(java.util.List<QueryLinkeantcodeAntcodeSearchblobsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryLinkeantcodeAntcodeSearchblobsResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryLinkeantcodeAntcodeSearchblobsResponseBodyList extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("HighlightedContent")
        public String highlightedContent;

        @NameInMap("IndexedAt")
        public String indexedAt;

        @NameInMap("Language")
        public String language;

        @NameInMap("Path")
        public String path;

        @NameInMap("Project")
        public String project;

        @NameInMap("Ref")
        public String ref;

        public static QueryLinkeantcodeAntcodeSearchblobsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeSearchblobsResponseBodyList self = new QueryLinkeantcodeAntcodeSearchblobsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeSearchblobsResponseBodyList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryLinkeantcodeAntcodeSearchblobsResponseBodyList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryLinkeantcodeAntcodeSearchblobsResponseBodyList setHighlightedContent(String highlightedContent) {
            this.highlightedContent = highlightedContent;
            return this;
        }
        public String getHighlightedContent() {
            return this.highlightedContent;
        }

        public QueryLinkeantcodeAntcodeSearchblobsResponseBodyList setIndexedAt(String indexedAt) {
            this.indexedAt = indexedAt;
            return this;
        }
        public String getIndexedAt() {
            return this.indexedAt;
        }

        public QueryLinkeantcodeAntcodeSearchblobsResponseBodyList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryLinkeantcodeAntcodeSearchblobsResponseBodyList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLinkeantcodeAntcodeSearchblobsResponseBodyList setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public QueryLinkeantcodeAntcodeSearchblobsResponseBodyList setRef(String ref) {
            this.ref = ref;
            return this;
        }
        public String getRef() {
            return this.ref;
        }

    }

}

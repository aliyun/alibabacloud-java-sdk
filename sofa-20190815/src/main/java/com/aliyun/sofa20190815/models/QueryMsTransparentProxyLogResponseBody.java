// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsTransparentProxyLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartIndex")
    public Long startIndex;

    @NameInMap("TotalSize")
    public Long totalSize;

    @NameInMap("List")
    public java.util.List<QueryMsTransparentProxyLogResponseBodyList> list;

    public static QueryMsTransparentProxyLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsTransparentProxyLogResponseBody self = new QueryMsTransparentProxyLogResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsTransparentProxyLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsTransparentProxyLogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsTransparentProxyLogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsTransparentProxyLogResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsTransparentProxyLogResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsTransparentProxyLogResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsTransparentProxyLogResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsTransparentProxyLogResponseBody setList(java.util.List<QueryMsTransparentProxyLogResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryMsTransparentProxyLogResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryMsTransparentProxyLogResponseBodyList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyContent")
        public String modifyContent;

        @NameInMap("ModifyName")
        public String modifyName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Port")
        public Long port;

        public static QueryMsTransparentProxyLogResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryMsTransparentProxyLogResponseBodyList self = new QueryMsTransparentProxyLogResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryMsTransparentProxyLogResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsTransparentProxyLogResponseBodyList setModifyContent(String modifyContent) {
            this.modifyContent = modifyContent;
            return this;
        }
        public String getModifyContent() {
            return this.modifyContent;
        }

        public QueryMsTransparentProxyLogResponseBodyList setModifyName(String modifyName) {
            this.modifyName = modifyName;
            return this;
        }
        public String getModifyName() {
            return this.modifyName;
        }

        public QueryMsTransparentProxyLogResponseBodyList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public QueryMsTransparentProxyLogResponseBodyList setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

    }

}

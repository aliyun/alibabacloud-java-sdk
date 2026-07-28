// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class ListDomainResponseBody extends TeaModel {
    @NameInMap("DomainInfoList")
    public java.util.List<ListDomainResponseBodyDomainInfoList> domainInfoList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainResponseBody self = new ListDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainResponseBody setDomainInfoList(java.util.List<ListDomainResponseBodyDomainInfoList> domainInfoList) {
        this.domainInfoList = domainInfoList;
        return this;
    }
    public java.util.List<ListDomainResponseBodyDomainInfoList> getDomainInfoList() {
        return this.domainInfoList;
    }

    public ListDomainResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDomainResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDomainResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDomainResponseBodyDomainInfoListToolList extends TeaModel {
        @NameInMap("ToolCode")
        public String toolCode;

        @NameInMap("ToolName")
        public String toolName;

        public static ListDomainResponseBodyDomainInfoListToolList build(java.util.Map<String, ?> map) throws Exception {
            ListDomainResponseBodyDomainInfoListToolList self = new ListDomainResponseBodyDomainInfoListToolList();
            return TeaModel.build(map, self);
        }

        public ListDomainResponseBodyDomainInfoListToolList setToolCode(String toolCode) {
            this.toolCode = toolCode;
            return this;
        }
        public String getToolCode() {
            return this.toolCode;
        }

        public ListDomainResponseBodyDomainInfoListToolList setToolName(String toolName) {
            this.toolName = toolName;
            return this;
        }
        public String getToolName() {
            return this.toolName;
        }

    }

    public static class ListDomainResponseBodyDomainInfoList extends TeaModel {
        @NameInMap("DomainCode")
        public String domainCode;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ToolCount")
        public Integer toolCount;

        @NameInMap("ToolList")
        public java.util.List<ListDomainResponseBodyDomainInfoListToolList> toolList;

        public static ListDomainResponseBodyDomainInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListDomainResponseBodyDomainInfoList self = new ListDomainResponseBodyDomainInfoList();
            return TeaModel.build(map, self);
        }

        public ListDomainResponseBodyDomainInfoList setDomainCode(String domainCode) {
            this.domainCode = domainCode;
            return this;
        }
        public String getDomainCode() {
            return this.domainCode;
        }

        public ListDomainResponseBodyDomainInfoList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListDomainResponseBodyDomainInfoList setToolCount(Integer toolCount) {
            this.toolCount = toolCount;
            return this;
        }
        public Integer getToolCount() {
            return this.toolCount;
        }

        public ListDomainResponseBodyDomainInfoList setToolList(java.util.List<ListDomainResponseBodyDomainInfoListToolList> toolList) {
            this.toolList = toolList;
            return this;
        }
        public java.util.List<ListDomainResponseBodyDomainInfoListToolList> getToolList() {
            return this.toolList;
        }

    }

}

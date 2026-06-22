// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListGroupsResponseBody extends TeaModel {
    /**
     * <p>The status code returned by the API request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of server groups.</p>
     */
    @NameInMap("List")
    public java.util.List<ListGroupsResponseBodyList> list;

    /**
     * <p>The detailed information of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information of the query results.</p>
     */
    @NameInMap("PageInfo")
    public ListGroupsResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request, which can be used for troubleshooting and diagnostics.</p>
     * 
     * <strong>example:</strong>
     * <p>CB414DB5-F692-5DAB-9F0F-975C060AF***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the exception event was processed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Processed.</li>
     * <li><strong>false</strong>: Not processed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsResponseBody self = new ListGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGroupsResponseBody setList(java.util.List<ListGroupsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListGroupsResponseBodyList> getList() {
        return this.list;
    }

    public ListGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGroupsResponseBody setPageInfo(ListGroupsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListGroupsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGroupsResponseBodyList extends TeaModel {
        /**
         * <p>The type of the server group. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: default group</li>
         * <li><strong>1</strong>: other group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GroupFlag")
        public Integer groupFlag;

        /**
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>11028542</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The name of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen+dir-1440978***</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static ListGroupsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseBodyList self = new ListGroupsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListGroupsResponseBodyList setGroupFlag(Integer groupFlag) {
            this.groupFlag = groupFlag;
            return this;
        }
        public Integer getGroupFlag() {
            return this.groupFlag;
        }

        public ListGroupsResponseBodyList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListGroupsResponseBodyList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class ListGroupsResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the current page in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The NextToken value returned when the NextToken method is used.</p>
         * 
         * <strong>example:</strong>
         * <p>B604532DEF982B875E8360A6EFA3B***</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>202</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListGroupsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseBodyPageInfo self = new ListGroupsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListGroupsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListGroupsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListGroupsResponseBodyPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListGroupsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGroupsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

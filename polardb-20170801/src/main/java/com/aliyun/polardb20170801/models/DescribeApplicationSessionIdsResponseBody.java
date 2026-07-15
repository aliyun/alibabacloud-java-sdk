// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationSessionIdsResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-********************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Items")
    public DescribeApplicationSessionIdsResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7F2007D3-7E74-4ECB-89A8-BF130D******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribeApplicationSessionIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationSessionIdsResponseBody self = new DescribeApplicationSessionIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationSessionIdsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationSessionIdsResponseBody setItems(DescribeApplicationSessionIdsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeApplicationSessionIdsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeApplicationSessionIdsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApplicationSessionIdsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeApplicationSessionIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationSessionIdsResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeApplicationSessionIdsResponseBodyItemsItems extends TeaModel {
        @NameInMap("Agent")
        public String agent;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("Time")
        public String time;

        public static DescribeApplicationSessionIdsResponseBodyItemsItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationSessionIdsResponseBodyItemsItems self = new DescribeApplicationSessionIdsResponseBodyItemsItems();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationSessionIdsResponseBodyItemsItems setAgent(String agent) {
            this.agent = agent;
            return this;
        }
        public String getAgent() {
            return this.agent;
        }

        public DescribeApplicationSessionIdsResponseBodyItemsItems setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribeApplicationSessionIdsResponseBodyItemsItems setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class DescribeApplicationSessionIdsResponseBodyItems extends TeaModel {
        @NameInMap("items")
        public java.util.List<DescribeApplicationSessionIdsResponseBodyItemsItems> items;

        public static DescribeApplicationSessionIdsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationSessionIdsResponseBodyItems self = new DescribeApplicationSessionIdsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationSessionIdsResponseBodyItems setItems(java.util.List<DescribeApplicationSessionIdsResponseBodyItemsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeApplicationSessionIdsResponseBodyItemsItems> getItems() {
            return this.items;
        }

    }

}

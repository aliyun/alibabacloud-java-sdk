// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListPageListResponseBody extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public String currentPage;

    /**
     * <p>Page size, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeNameListPageListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("totalItem")
    public String totalItem;

    /**
     * <p>Total number of pages</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("totalPage")
    public String totalPage;

    public static DescribeNameListPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListPageListResponseBody self = new DescribeNameListPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNameListPageListResponseBody setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeNameListPageListResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeNameListPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNameListPageListResponseBody setResultObject(java.util.List<DescribeNameListPageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeNameListPageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeNameListPageListResponseBody setTotalItem(String totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public String getTotalItem() {
        return this.totalItem;
    }

    public DescribeNameListPageListResponseBody setTotalPage(String totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public String getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeNameListPageListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>ID of the list variable content data</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>NameList Content memo</p>
         * 
         * <strong>example:</strong>
         * <p>名单内容描述</p>
         */
        @NameInMap("memo")
        public String memo;

        /**
         * <p>Variable name</p>
         * 
         * <strong>example:</strong>
         * <p>nl_UN8otElLb490</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Variable type</p>
         * 
         * <strong>example:</strong>
         * <p>accountId</p>
         */
        @NameInMap("nameListType")
        public String nameListType;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>白名单</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>User UID</p>
         * 
         * <strong>example:</strong>
         * <p>130433202307074287</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>Variable value</p>
         * 
         * <strong>example:</strong>
         * <p>130433202307074287</p>
         */
        @NameInMap("value")
        public String value;

        /**
         * <p>Variable ID.</p>
         * 
         * <strong>example:</strong>
         * <p>762</p>
         */
        @NameInMap("variableId")
        public Long variableId;

        public static DescribeNameListPageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeNameListPageListResponseBodyResultObject self = new DescribeNameListPageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeNameListPageListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeNameListPageListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeNameListPageListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeNameListPageListResponseBodyResultObject setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public DescribeNameListPageListResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNameListPageListResponseBodyResultObject setNameListType(String nameListType) {
            this.nameListType = nameListType;
            return this;
        }
        public String getNameListType() {
            return this.nameListType;
        }

        public DescribeNameListPageListResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeNameListPageListResponseBodyResultObject setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeNameListPageListResponseBodyResultObject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeNameListPageListResponseBodyResultObject setVariableId(Long variableId) {
            this.variableId = variableId;
            return this;
        }
        public Long getVariableId() {
            return this.variableId;
        }

    }

}

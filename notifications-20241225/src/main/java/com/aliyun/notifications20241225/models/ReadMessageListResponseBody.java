// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMessageListResponseBody extends TeaModel {
    /**
     * <p>The response code. The value Success indicates that the request is successful. Other values indicate that the request failed. For more information about error codes, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data</p>
     */
    @NameInMap("Data")
    public ReadMessageListResponseBodyData data;

    /**
     * <p>message</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>唯一请求id</p>
     * 
     * <strong>example:</strong>
     * <p>A5F62766-1C2F-1F56-A39D-63E3D30F0633</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReadMessageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageListResponseBody self = new ReadMessageListResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadMessageListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadMessageListResponseBody setData(ReadMessageListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReadMessageListResponseBodyData getData() {
        return this.data;
    }

    public ReadMessageListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadMessageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadMessageListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadMessageListResponseBodyDataRows extends TeaModel {
        /**
         * <p>CategoryName</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>Class</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Class")
        public String _class;

        /**
         * <p>ClassId</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClassId")
        public Long classId;

        /**
         * <p>内容</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>删除</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Deleted")
        public Integer deleted;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1723772244000</p>
         */
        @NameInMap("GmtCreated")
        public Long gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>1723772244000</p>
         */
        @NameInMap("GmtUpdate")
        public Long gmtUpdate;

        /**
         * <p>massId</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("MassId")
        public Long massId;

        /**
         * <p>描述</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Memo")
        public String memo;

        /**
         * <p>消息id</p>
         * 
         * <strong>example:</strong>
         * <p>3727683838</p>
         */
        @NameInMap("MsgId")
        public Long msgId;

        /**
         * <p>状态</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>标题</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Title")
        public String title;

        @NameInMap("Titleh")
        public String titleh;

        public static ReadMessageListResponseBodyDataRows build(java.util.Map<String, ?> map) throws Exception {
            ReadMessageListResponseBodyDataRows self = new ReadMessageListResponseBodyDataRows();
            return TeaModel.build(map, self);
        }

        public ReadMessageListResponseBodyDataRows setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ReadMessageListResponseBodyDataRows set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public ReadMessageListResponseBodyDataRows setClassId(Long classId) {
            this.classId = classId;
            return this;
        }
        public Long getClassId() {
            return this.classId;
        }

        public ReadMessageListResponseBodyDataRows setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ReadMessageListResponseBodyDataRows setDeleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }
        public Integer getDeleted() {
            return this.deleted;
        }

        public ReadMessageListResponseBodyDataRows setGmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        public ReadMessageListResponseBodyDataRows setGmtUpdate(Long gmtUpdate) {
            this.gmtUpdate = gmtUpdate;
            return this;
        }
        public Long getGmtUpdate() {
            return this.gmtUpdate;
        }

        public ReadMessageListResponseBodyDataRows setMassId(Long massId) {
            this.massId = massId;
            return this;
        }
        public Long getMassId() {
            return this.massId;
        }

        public ReadMessageListResponseBodyDataRows setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ReadMessageListResponseBodyDataRows setMsgId(Long msgId) {
            this.msgId = msgId;
            return this;
        }
        public Long getMsgId() {
            return this.msgId;
        }

        public ReadMessageListResponseBodyDataRows setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ReadMessageListResponseBodyDataRows setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ReadMessageListResponseBodyDataRows setTitleh(String titleh) {
            this.titleh = titleh;
            return this;
        }
        public String getTitleh() {
            return this.titleh;
        }

    }

    public static class ReadMessageListResponseBodyData extends TeaModel {
        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("MaxResults")
        public Long maxResults;

        /**
         * <p>If excess return values exist, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The number of rows updated or returned on PolarDB-X 2.0 compute nodes.</p>
         */
        @NameInMap("Rows")
        public java.util.List<ReadMessageListResponseBodyDataRows> rows;

        public static ReadMessageListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadMessageListResponseBodyData self = new ReadMessageListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadMessageListResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ReadMessageListResponseBodyData setMaxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Long getMaxResults() {
            return this.maxResults;
        }

        public ReadMessageListResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ReadMessageListResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ReadMessageListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ReadMessageListResponseBodyData setRows(java.util.List<ReadMessageListResponseBodyDataRows> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<ReadMessageListResponseBodyDataRows> getRows() {
            return this.rows;
        }

    }

}

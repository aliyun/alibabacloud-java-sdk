// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetMailTaskListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0c52************8e1952a3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The paging information for the tracking tasks.</p>
     */
    @NameInMap("Result")
    public GetMailTaskListResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMailTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMailTaskListResponseBody self = new GetMailTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMailTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMailTaskListResponseBody setResult(GetMailTaskListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMailTaskListResponseBodyResult getResult() {
        return this.result;
    }

    public GetMailTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMailTaskListResponseBodyResultData extends TeaModel {
        /**
         * <p>The nickname of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BizOwnerName")
        public String bizOwnerName;

        /**
         * <p>The user ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>asag****2423</p>
         */
        @NameInMap("BizOwnerUserId")
        public String bizOwnerUserId;

        /**
         * <p>The mail ID of the tracking task.</p>
         * 
         * <strong>example:</strong>
         * <p>2342526</p>
         */
        @NameInMap("MailId")
        public String mailId;

        /**
         * <p>Indicates whether the task is paused.</p>
         * <ul>
         * <li><p>true: The task is paused.</p>
         * </li>
         * <li><p>false: The task is not paused.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Paused")
        public Boolean paused;

        /**
         * <p>The name of the tracking task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SubscribeName")
        public String subscribeName;

        public static GetMailTaskListResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            GetMailTaskListResponseBodyResultData self = new GetMailTaskListResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public GetMailTaskListResponseBodyResultData setBizOwnerName(String bizOwnerName) {
            this.bizOwnerName = bizOwnerName;
            return this;
        }
        public String getBizOwnerName() {
            return this.bizOwnerName;
        }

        public GetMailTaskListResponseBodyResultData setBizOwnerUserId(String bizOwnerUserId) {
            this.bizOwnerUserId = bizOwnerUserId;
            return this;
        }
        public String getBizOwnerUserId() {
            return this.bizOwnerUserId;
        }

        public GetMailTaskListResponseBodyResultData setMailId(String mailId) {
            this.mailId = mailId;
            return this;
        }
        public String getMailId() {
            return this.mailId;
        }

        public GetMailTaskListResponseBodyResultData setPaused(Boolean paused) {
            this.paused = paused;
            return this;
        }
        public Boolean getPaused() {
            return this.paused;
        }

        public GetMailTaskListResponseBodyResultData setSubscribeName(String subscribeName) {
            this.subscribeName = subscribeName;
            return this;
        }
        public String getSubscribeName() {
            return this.subscribeName;
        }

    }

    public static class GetMailTaskListResponseBodyResult extends TeaModel {
        /**
         * <p>An array of tracking task models.</p>
         */
        @NameInMap("Data")
        public java.util.List<GetMailTaskListResponseBodyResultData> data;

        /**
         * <p>The next page number. A value of null or 0 indicates that there is no next page.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Next")
        public Integer next;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page that was set for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The previous page number. A value of null or 0 indicates that there is no previous page.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Pre")
        public Integer pre;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static GetMailTaskListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMailTaskListResponseBodyResult self = new GetMailTaskListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMailTaskListResponseBodyResult setData(java.util.List<GetMailTaskListResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetMailTaskListResponseBodyResultData> getData() {
            return this.data;
        }

        public GetMailTaskListResponseBodyResult setNext(Integer next) {
            this.next = next;
            return this;
        }
        public Integer getNext() {
            return this.next;
        }

        public GetMailTaskListResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetMailTaskListResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMailTaskListResponseBodyResult setPre(Integer pre) {
            this.pre = pre;
            return this;
        }
        public Integer getPre() {
            return this.pre;
        }

        public GetMailTaskListResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public GetMailTaskListResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}

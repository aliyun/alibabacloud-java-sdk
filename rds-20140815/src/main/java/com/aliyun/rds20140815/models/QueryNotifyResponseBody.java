// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class QueryNotifyResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public QueryNotifyResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94CB8D93-017A-5AE7-A118-6E0F89D93C0A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryNotifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryNotifyResponseBody self = new QueryNotifyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryNotifyResponseBody setData(QueryNotifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryNotifyResponseBodyData getData() {
        return this.data;
    }

    public QueryNotifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryNotifyResponseBodyDataNotifyItemList extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>22973492**********</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>Indicates whether the notification has been confirmed. You can call the <a href="https://help.aliyun.com/document_detail/610444.html">ConfirmNotify</a> operation to mark the notification as confirmed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConfirmFlag")
        public Boolean confirmFlag;

        /**
         * <p>The UID of the contact who called the <a href="https://help.aliyun.com/document_detail/610444.html">ConfirmNotify</a> operation to mark the notification as confirmed. The contact belongs to the current Alibaba Cloud account.</p>
         * <p>The value <strong>0</strong> indicates that the notification is automatically confirmed by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Confirmor")
        public Long confirmor;

        /**
         * <p>The time when the notification was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-21T02:04:04Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the notification was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-21T02:10:47Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the notification.</p>
         * 
         * <strong>example:</strong>
         * <p>103499</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of times that repeatedly sent notifications are blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IdempotentCount")
        public String idempotentCount;

        /**
         * <p>This parameter ensures the idempotence of the notification and prevents the notification from being repeatedly sent.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCzxxxxxxxxxx</p>
         */
        @NameInMap("IdempotentId")
        public String idempotentId;

        /**
         * <p>The level of the notification. Valid values:</p>
         * <ul>
         * <li><strong>help</strong></li>
         * <li><strong>success</strong></li>
         * <li><strong>warning</strong></li>
         * <li><strong>error</strong></li>
         * <li><strong>loading</strong></li>
         * <li><strong>notice</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The element in the notification template. This parameter is a JSON string. Fields in the JSON string vary based on the value of the <strong>TemplateName</strong> parameter.</p>
         * <ul>
         * <li><p>If the <strong>TemplateName</strong> parameter is <strong>RenewalRecommend</strong>, the JSON string contains the following fields:</p>
         * <ul>
         * <li><strong>instanceName</strong>: the ID of the instance that is about to expire</li>
         * <li><strong>reservedTime</strong>: the remaining validity period of the instance in days</li>
         * </ul>
         * </li>
         * <li><p>If the <strong>TemplateName</strong> parameter is <strong>InstanceCreateFailed</strong>, the JSON string contains the following fields:</p>
         * <ul>
         * <li><strong>orderId</strong>: the ID of the order to purchase the instance</li>
         * <li><strong>reason</strong>: the cause of the instance creation failure</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;orderId\&quot;:21466**********}</p>
         */
        @NameInMap("NotifyElement")
        public String notifyElement;

        /**
         * <p>The template of the notification. Valid values:</p>
         * <ul>
         * <li><strong>RenewalRecommend</strong>: The template that is used to notify of renewal suggestions.</li>
         * <li><strong>InstanceCreateFailed</strong>: The template that is used to notify that an instance fails to be created and is refunded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InstanceCreateFailed</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The type of the notification. Valid values:</p>
         * <ul>
         * <li><strong>Sell</strong>: sales notification</li>
         * <li><strong>Operation</strong>: O\&amp;M notification</li>
         * <li><strong>Promotion</strong>: promotion notification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Sell</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryNotifyResponseBodyDataNotifyItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryNotifyResponseBodyDataNotifyItemList self = new QueryNotifyResponseBodyDataNotifyItemList();
            return TeaModel.build(map, self);
        }

        public QueryNotifyResponseBodyDataNotifyItemList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setConfirmFlag(Boolean confirmFlag) {
            this.confirmFlag = confirmFlag;
            return this;
        }
        public Boolean getConfirmFlag() {
            return this.confirmFlag;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setConfirmor(Long confirmor) {
            this.confirmor = confirmor;
            return this;
        }
        public Long getConfirmor() {
            return this.confirmor;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setIdempotentCount(String idempotentCount) {
            this.idempotentCount = idempotentCount;
            return this;
        }
        public String getIdempotentCount() {
            return this.idempotentCount;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setIdempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }
        public String getIdempotentId() {
            return this.idempotentId;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setNotifyElement(String notifyElement) {
            this.notifyElement = notifyElement;
            return this;
        }
        public String getNotifyElement() {
            return this.notifyElement;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryNotifyResponseBodyData extends TeaModel {
        /**
         * <p>The details of notifications.</p>
         */
        @NameInMap("NotifyItemList")
        public java.util.List<QueryNotifyResponseBodyDataNotifyItemList> notifyItemList;

        /**
         * <p>The page number of the page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalRecordCount")
        public Integer totalRecordCount;

        public static QueryNotifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryNotifyResponseBodyData self = new QueryNotifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryNotifyResponseBodyData setNotifyItemList(java.util.List<QueryNotifyResponseBodyDataNotifyItemList> notifyItemList) {
            this.notifyItemList = notifyItemList;
            return this;
        }
        public java.util.List<QueryNotifyResponseBodyDataNotifyItemList> getNotifyItemList() {
            return this.notifyItemList;
        }

        public QueryNotifyResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryNotifyResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryNotifyResponseBodyData setTotalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }
        public Integer getTotalRecordCount() {
            return this.totalRecordCount;
        }

    }

}

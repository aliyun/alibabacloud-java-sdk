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
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>Indicates whether the notification has been confirmed. You can call the [ConfirmNotify](~~610444~~) operation to mark the notification as confirmed. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ConfirmFlag")
        public Boolean confirmFlag;

        /**
         * <p>The UID of the contact who called the [ConfirmNotify](~~610444~~) operation to mark the notification as confirmed. The contact belongs to the current Alibaba Cloud account.</p>
         * <br>
         * <p>The value **0** indicates that the notification is automatically confirmed by the system.</p>
         */
        @NameInMap("Confirmor")
        public Long confirmor;

        /**
         * <p>The time when the notification was created.</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the notification was modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the notification.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of times that repeatedly sent notifications are blocked.</p>
         */
        @NameInMap("IdempotentCount")
        public String idempotentCount;

        /**
         * <p>This parameter ensures the idempotence of the notification and prevents the notification from being repeatedly sent.</p>
         */
        @NameInMap("IdempotentId")
        public String idempotentId;

        /**
         * <p>The level of the notification. Valid values:</p>
         * <br>
         * <p>*   **help**</p>
         * <p>*   **success**</p>
         * <p>*   **warning**</p>
         * <p>*   **error**</p>
         * <p>*   **loading**</p>
         * <p>*   **notice**</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The element in the notification template. This parameter is a JSON string. Fields in the JSON string vary based on the value of the **TemplateName** parameter.</p>
         * <br>
         * <p>*   If the **TemplateName** parameter is **RenewalRecommend**, the JSON string contains the following fields:</p>
         * <br>
         * <p>    *   **instanceName**: the ID of the instance that is about to expire</p>
         * <p>    *   **reservedTime**: the remaining validity period of the instance in days</p>
         * <br>
         * <p>*   If the **TemplateName** parameter is **InstanceCreateFailed**, the JSON string contains the following fields:</p>
         * <br>
         * <p>    *   **orderId**: the ID of the order to purchase the instance</p>
         * <p>    *   **reason**: the cause of the instance creation failure</p>
         */
        @NameInMap("NotifyElement")
        public String notifyElement;

        /**
         * <p>The template of the notification. Valid values:</p>
         * <br>
         * <p>*   **RenewalRecommend**: The template that is used to notify of renewal suggestions.</p>
         * <p>*   **InstanceCreateFailed**: The template that is used to notify that an instance fails to be created and is refunded.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The type of the notification. Valid values:</p>
         * <br>
         * <p>*   **Sell**: sales notification</p>
         * <p>*   **Operation**: O\&M notification</p>
         * <p>*   **Promotion**: promotion notification</p>
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
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
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

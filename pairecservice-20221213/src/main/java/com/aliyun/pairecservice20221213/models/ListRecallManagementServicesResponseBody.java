// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListRecallManagementServicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RecallManagementServices")
    public java.util.List<ListRecallManagementServicesResponseBodyRecallManagementServices> recallManagementServices;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRecallManagementServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecallManagementServicesResponseBody self = new ListRecallManagementServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecallManagementServicesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRecallManagementServicesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRecallManagementServicesResponseBody setRecallManagementServices(java.util.List<ListRecallManagementServicesResponseBodyRecallManagementServices> recallManagementServices) {
        this.recallManagementServices = recallManagementServices;
        return this;
    }
    public java.util.List<ListRecallManagementServicesResponseBodyRecallManagementServices> getRecallManagementServices() {
        return this.recallManagementServices;
    }

    public ListRecallManagementServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecallManagementServicesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRecallManagementServicesResponseBodyRecallManagementServices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentRecallManagementServiceVersionId")
        public String currentRecallManagementServiceVersionId;

        /**
         * <strong>example:</strong>
         * <p>version-1</p>
         */
        @NameInMap("CurrentRecallManagementServiceVersionName")
        public String currentRecallManagementServiceVersionName;

        /**
         * <strong>example:</strong>
         * <p>this is a test recall</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>hot_group_recall</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RecallManagementServiceId")
        public String recallManagementServiceId;

        /**
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListRecallManagementServicesResponseBodyRecallManagementServices build(java.util.Map<String, ?> map) throws Exception {
            ListRecallManagementServicesResponseBodyRecallManagementServices self = new ListRecallManagementServicesResponseBodyRecallManagementServices();
            return TeaModel.build(map, self);
        }

        public ListRecallManagementServicesResponseBodyRecallManagementServices setCurrentRecallManagementServiceVersionId(String currentRecallManagementServiceVersionId) {
            this.currentRecallManagementServiceVersionId = currentRecallManagementServiceVersionId;
            return this;
        }
        public String getCurrentRecallManagementServiceVersionId() {
            return this.currentRecallManagementServiceVersionId;
        }

        public ListRecallManagementServicesResponseBodyRecallManagementServices setCurrentRecallManagementServiceVersionName(String currentRecallManagementServiceVersionName) {
            this.currentRecallManagementServiceVersionName = currentRecallManagementServiceVersionName;
            return this;
        }
        public String getCurrentRecallManagementServiceVersionName() {
            return this.currentRecallManagementServiceVersionName;
        }

        public ListRecallManagementServicesResponseBodyRecallManagementServices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRecallManagementServicesResponseBodyRecallManagementServices setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListRecallManagementServicesResponseBodyRecallManagementServices setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListRecallManagementServicesResponseBodyRecallManagementServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRecallManagementServicesResponseBodyRecallManagementServices setRecallManagementServiceId(String recallManagementServiceId) {
            this.recallManagementServiceId = recallManagementServiceId;
            return this;
        }
        public String getRecallManagementServiceId() {
            return this.recallManagementServiceId;
        }

        public ListRecallManagementServicesResponseBodyRecallManagementServices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListRecallManagementServiceVersionsResponseBody extends TeaModel {
    @NameInMap("RecallManagementServiceVersions")
    public java.util.List<ListRecallManagementServiceVersionsResponseBodyRecallManagementServiceVersions> recallManagementServiceVersions;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRecallManagementServiceVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecallManagementServiceVersionsResponseBody self = new ListRecallManagementServiceVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecallManagementServiceVersionsResponseBody setRecallManagementServiceVersions(java.util.List<ListRecallManagementServiceVersionsResponseBodyRecallManagementServiceVersions> recallManagementServiceVersions) {
        this.recallManagementServiceVersions = recallManagementServiceVersions;
        return this;
    }
    public java.util.List<ListRecallManagementServiceVersionsResponseBodyRecallManagementServiceVersions> getRecallManagementServiceVersions() {
        return this.recallManagementServiceVersions;
    }

    public ListRecallManagementServiceVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecallManagementServiceVersionsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRecallManagementServiceVersionsResponseBodyRecallManagementServiceVersions extends TeaModel {
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
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <strong>example:</strong>
         * <p>version-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecallManagementServiceVersionId")
        public String recallManagementServiceVersionId;

        public static ListRecallManagementServiceVersionsResponseBodyRecallManagementServiceVersions build(java.util.Map<String, ?> map) throws Exception {
            ListRecallManagementServiceVersionsResponseBodyRecallManagementServiceVersions self = new ListRecallManagementServiceVersionsResponseBodyRecallManagementServiceVersions();
            return TeaModel.build(map, self);
        }

        public ListRecallManagementServiceVersionsResponseBodyRecallManagementServiceVersions setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListRecallManagementServiceVersionsResponseBodyRecallManagementServiceVersions setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListRecallManagementServiceVersionsResponseBodyRecallManagementServiceVersions setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public ListRecallManagementServiceVersionsResponseBodyRecallManagementServiceVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRecallManagementServiceVersionsResponseBodyRecallManagementServiceVersions setRecallManagementServiceVersionId(String recallManagementServiceVersionId) {
            this.recallManagementServiceVersionId = recallManagementServiceVersionId;
            return this;
        }
        public String getRecallManagementServiceVersionId() {
            return this.recallManagementServiceVersionId;
        }

    }

}

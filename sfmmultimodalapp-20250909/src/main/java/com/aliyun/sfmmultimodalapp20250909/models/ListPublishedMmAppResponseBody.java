// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class ListPublishedMmAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PublishedVersionInfoList")
    public java.util.List<ListPublishedMmAppResponseBodyPublishedVersionInfoList> publishedVersionInfoList;

    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPublishedMmAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedMmAppResponseBody self = new ListPublishedMmAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublishedMmAppResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPublishedMmAppResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPublishedMmAppResponseBody setPublishedVersionInfoList(java.util.List<ListPublishedMmAppResponseBodyPublishedVersionInfoList> publishedVersionInfoList) {
        this.publishedVersionInfoList = publishedVersionInfoList;
        return this;
    }
    public java.util.List<ListPublishedMmAppResponseBodyPublishedVersionInfoList> getPublishedVersionInfoList() {
        return this.publishedVersionInfoList;
    }

    public ListPublishedMmAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublishedMmAppResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPublishedMmAppResponseBodyPublishedVersionInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mm_xxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>多模态应用xxx</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>234343</p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <strong>example:</strong>
         * <p>ccccc</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Long version;

        public static ListPublishedMmAppResponseBodyPublishedVersionInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedMmAppResponseBodyPublishedVersionInfoList self = new ListPublishedMmAppResponseBodyPublishedVersionInfoList();
            return TeaModel.build(map, self);
        }

        public ListPublishedMmAppResponseBodyPublishedVersionInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListPublishedMmAppResponseBodyPublishedVersionInfoList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListPublishedMmAppResponseBodyPublishedVersionInfoList setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListPublishedMmAppResponseBodyPublishedVersionInfoList setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListPublishedMmAppResponseBodyPublishedVersionInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPublishedMmAppResponseBodyPublishedVersionInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListPublishedMmAppResponseBodyPublishedVersionInfoList setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public ListPublishedMmAppResponseBodyPublishedVersionInfoList setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class ListYikeProductionsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>Token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of projects.</p>
     */
    @NameInMap("ProductionList")
    public java.util.List<ListYikeProductionsResponseBodyProductionList> productionList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListYikeProductionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListYikeProductionsResponseBody self = new ListYikeProductionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListYikeProductionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListYikeProductionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListYikeProductionsResponseBody setProductionList(java.util.List<ListYikeProductionsResponseBodyProductionList> productionList) {
        this.productionList = productionList;
        return this;
    }
    public java.util.List<ListYikeProductionsResponseBodyProductionList> getProductionList() {
        return this.productionList;
    }

    public ListYikeProductionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListYikeProductionsResponseBodyProductionList extends TeaModel {
        /**
         * <p>The authentication method.</p>
         * 
         * <strong>example:</strong>
         * <p>Manage</p>
         */
        @NameInMap("Auth")
        public String auth;

        /**
         * <p>The cover URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://tagvvcloud-material-center-prod.oss-cn-hangzhou.aliyuncs.com/sumvideo/utils_image/sumvideo-video-cover.png">https://tagvvcloud-material-center-prod.oss-cn-hangzhou.aliyuncs.com/sumvideo/utils_image/sumvideo-video-cover.png</a></p>
         */
        @NameInMap("CoverUrl")
        public String coverUrl;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-07T02:21:36Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The username of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_183*************</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>The project description.</p>
         * 
         * <strong>example:</strong>
         * <p>Swas_QuerySwasInstanceByRegion</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_463862****</p>
         */
        @NameInMap("ProductionId")
        public String productionId;

        /**
         * <p>The project title.</p>
         * 
         * <strong>example:</strong>
         * <p>Harvest</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-m3r546h1n9kq3mtm</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListYikeProductionsResponseBodyProductionList build(java.util.Map<String, ?> map) throws Exception {
            ListYikeProductionsResponseBodyProductionList self = new ListYikeProductionsResponseBodyProductionList();
            return TeaModel.build(map, self);
        }

        public ListYikeProductionsResponseBodyProductionList setAuth(String auth) {
            this.auth = auth;
            return this;
        }
        public String getAuth() {
            return this.auth;
        }

        public ListYikeProductionsResponseBodyProductionList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListYikeProductionsResponseBodyProductionList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListYikeProductionsResponseBodyProductionList setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListYikeProductionsResponseBodyProductionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListYikeProductionsResponseBodyProductionList setProductionId(String productionId) {
            this.productionId = productionId;
            return this;
        }
        public String getProductionId() {
            return this.productionId;
        }

        public ListYikeProductionsResponseBodyProductionList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListYikeProductionsResponseBodyProductionList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}

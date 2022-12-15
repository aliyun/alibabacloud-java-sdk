// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class QuerySDKInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySDKInstancesResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Ok")
    public Boolean ok;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySDKInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySDKInstancesResponseBody self = new QuerySDKInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySDKInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySDKInstancesResponseBody setData(QuerySDKInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySDKInstancesResponseBodyData getData() {
        return this.data;
    }

    public QuerySDKInstancesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySDKInstancesResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public QuerySDKInstancesResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public QuerySDKInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySDKInstancesResponseBodyDataContent extends TeaModel {
        @NameInMap("BundleId")
        public String bundleId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LatestBuild")
        public String latestBuild;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Recipe")
        public String recipe;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ValidFromDate")
        public String validFromDate;

        @NameInMap("ValidToDate")
        public String validToDate;

        public static QuerySDKInstancesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            QuerySDKInstancesResponseBodyDataContent self = new QuerySDKInstancesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public QuerySDKInstancesResponseBodyDataContent setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public QuerySDKInstancesResponseBodyDataContent setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QuerySDKInstancesResponseBodyDataContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QuerySDKInstancesResponseBodyDataContent setLatestBuild(String latestBuild) {
            this.latestBuild = latestBuild;
            return this;
        }
        public String getLatestBuild() {
            return this.latestBuild;
        }

        public QuerySDKInstancesResponseBodyDataContent setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public QuerySDKInstancesResponseBodyDataContent setRecipe(String recipe) {
            this.recipe = recipe;
            return this;
        }
        public String getRecipe() {
            return this.recipe;
        }

        public QuerySDKInstancesResponseBodyDataContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySDKInstancesResponseBodyDataContent setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QuerySDKInstancesResponseBodyDataContent setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QuerySDKInstancesResponseBodyDataContent setValidFromDate(String validFromDate) {
            this.validFromDate = validFromDate;
            return this;
        }
        public String getValidFromDate() {
            return this.validFromDate;
        }

        public QuerySDKInstancesResponseBodyDataContent setValidToDate(String validToDate) {
            this.validToDate = validToDate;
            return this;
        }
        public String getValidToDate() {
            return this.validToDate;
        }

    }

    public static class QuerySDKInstancesResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<QuerySDKInstancesResponseBodyDataContent> content;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QuerySDKInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySDKInstancesResponseBodyData self = new QuerySDKInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySDKInstancesResponseBodyData setContent(java.util.List<QuerySDKInstancesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<QuerySDKInstancesResponseBodyDataContent> getContent() {
            return this.content;
        }

        public QuerySDKInstancesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QuerySDKInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySDKInstancesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

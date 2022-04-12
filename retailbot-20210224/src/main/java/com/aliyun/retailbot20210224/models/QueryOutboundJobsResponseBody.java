// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobsResponseBody extends TeaModel {
    // BaseResult<List<OutboundJobDTO>>
    @NameInMap("Content")
    public QueryOutboundJobsResponseBodyContent content;

    @NameInMap("First")
    public Boolean first;

    @NameInMap("Last")
    public Boolean last;

    public static QueryOutboundJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobsResponseBody self = new QueryOutboundJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobsResponseBody setContent(QueryOutboundJobsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public QueryOutboundJobsResponseBodyContent getContent() {
        return this.content;
    }

    public QueryOutboundJobsResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public QueryOutboundJobsResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public static class QueryOutboundJobsResponseBodyContentData extends TeaModel {
        // appCode
        @NameInMap("AppCode")
        public String appCode;

        // 应用ID
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Config")
        public String config;

        @NameInMap("CrowdConfig")
        public String crowdConfig;

        // 人群类型：上传人群/算法人群
        @NameInMap("CrowdType")
        public Integer crowdType;

        @NameInMap("EndTime")
        public String endTime;

        // 创建时间
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // 修改时间
        @NameInMap("GmtModified")
        public String gmtModified;

        // 主键
        @NameInMap("Id")
        public Long id;

        // 任务名称：唯一，避免重复提交
        @NameInMap("JobName")
        public String jobName;

        @NameInMap("RunConfig")
        public String runConfig;

        // 执行策略：1.一次性任务， 2.周期任务
        @NameInMap("RunType")
        public Integer runType;

        // saas Id
        @NameInMap("SaasId")
        public String saasId;

        // shop Id
        @NameInMap("ShopId")
        public Long shopId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        // tenant Id
        @NameInMap("TenantId")
        public Long tenantId;

        // 版本
        @NameInMap("Version")
        public String version;

        public static QueryOutboundJobsResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryOutboundJobsResponseBodyContentData self = new QueryOutboundJobsResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public QueryOutboundJobsResponseBodyContentData setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryOutboundJobsResponseBodyContentData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryOutboundJobsResponseBodyContentData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public QueryOutboundJobsResponseBodyContentData setCrowdConfig(String crowdConfig) {
            this.crowdConfig = crowdConfig;
            return this;
        }
        public String getCrowdConfig() {
            return this.crowdConfig;
        }

        public QueryOutboundJobsResponseBodyContentData setCrowdType(Integer crowdType) {
            this.crowdType = crowdType;
            return this;
        }
        public Integer getCrowdType() {
            return this.crowdType;
        }

        public QueryOutboundJobsResponseBodyContentData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryOutboundJobsResponseBodyContentData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryOutboundJobsResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryOutboundJobsResponseBodyContentData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryOutboundJobsResponseBodyContentData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public QueryOutboundJobsResponseBodyContentData setRunConfig(String runConfig) {
            this.runConfig = runConfig;
            return this;
        }
        public String getRunConfig() {
            return this.runConfig;
        }

        public QueryOutboundJobsResponseBodyContentData setRunType(Integer runType) {
            this.runType = runType;
            return this;
        }
        public Integer getRunType() {
            return this.runType;
        }

        public QueryOutboundJobsResponseBodyContentData setSaasId(String saasId) {
            this.saasId = saasId;
            return this;
        }
        public String getSaasId() {
            return this.saasId;
        }

        public QueryOutboundJobsResponseBodyContentData setShopId(Long shopId) {
            this.shopId = shopId;
            return this;
        }
        public Long getShopId() {
            return this.shopId;
        }

        public QueryOutboundJobsResponseBodyContentData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryOutboundJobsResponseBodyContentData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryOutboundJobsResponseBodyContentData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryOutboundJobsResponseBodyContentData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryOutboundJobsResponseBodyContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public java.util.List<QueryOutboundJobsResponseBodyContentData> data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static QueryOutboundJobsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            QueryOutboundJobsResponseBodyContent self = new QueryOutboundJobsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public QueryOutboundJobsResponseBodyContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryOutboundJobsResponseBodyContent setData(java.util.List<QueryOutboundJobsResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryOutboundJobsResponseBodyContentData> getData() {
            return this.data;
        }

        public QueryOutboundJobsResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryOutboundJobsResponseBodyContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}

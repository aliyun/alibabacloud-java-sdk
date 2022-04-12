// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryOutboundJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    public static QueryOutboundJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobResponseBody self = new QueryOutboundJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOutboundJobResponseBody setData(QueryOutboundJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOutboundJobResponseBodyData getData() {
        return this.data;
    }

    public QueryOutboundJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class QueryOutboundJobResponseBodyData extends TeaModel {
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

        // saas实例ID
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

        public static QueryOutboundJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOutboundJobResponseBodyData self = new QueryOutboundJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOutboundJobResponseBodyData setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryOutboundJobResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryOutboundJobResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public QueryOutboundJobResponseBodyData setCrowdConfig(String crowdConfig) {
            this.crowdConfig = crowdConfig;
            return this;
        }
        public String getCrowdConfig() {
            return this.crowdConfig;
        }

        public QueryOutboundJobResponseBodyData setCrowdType(Integer crowdType) {
            this.crowdType = crowdType;
            return this;
        }
        public Integer getCrowdType() {
            return this.crowdType;
        }

        public QueryOutboundJobResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryOutboundJobResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryOutboundJobResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryOutboundJobResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryOutboundJobResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public QueryOutboundJobResponseBodyData setRunConfig(String runConfig) {
            this.runConfig = runConfig;
            return this;
        }
        public String getRunConfig() {
            return this.runConfig;
        }

        public QueryOutboundJobResponseBodyData setRunType(Integer runType) {
            this.runType = runType;
            return this;
        }
        public Integer getRunType() {
            return this.runType;
        }

        public QueryOutboundJobResponseBodyData setSaasId(String saasId) {
            this.saasId = saasId;
            return this;
        }
        public String getSaasId() {
            return this.saasId;
        }

        public QueryOutboundJobResponseBodyData setShopId(Long shopId) {
            this.shopId = shopId;
            return this;
        }
        public Long getShopId() {
            return this.shopId;
        }

        public QueryOutboundJobResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryOutboundJobResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryOutboundJobResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryOutboundJobResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}

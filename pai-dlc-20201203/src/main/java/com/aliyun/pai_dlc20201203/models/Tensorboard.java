// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Tensorboard extends TeaModel {
    // Tensorboard Id
    @NameInMap("TensorboardId")
    public String tensorboardId;

    // Tensorboard URL
    @NameInMap("TensorboardUrl")
    public String tensorboardUrl;

    // 状态
    @NameInMap("Status")
    public String status;

    // 运行时长
    @NameInMap("Duration")
    public String duration;

    // 创建时间（UTC）
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 修改时间（UTC）
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 展示名称
    @NameInMap("DisplayName")
    public String displayName;

    // 数据源Id
    @NameInMap("DataSourceId")
    public String dataSourceId;

    // 文件路径
    @NameInMap("SummaryPath")
    public String summaryPath;

    // 创建者
    @NameInMap("UserId")
    public String userId;

    // 状态详情码
    @NameInMap("ReasonCode")
    public String reasonCode;

    // 状态详情
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    // 任务Id
    @NameInMap("JobId")
    public String jobId;

    public static Tensorboard build(java.util.Map<String, ?> map) throws Exception {
        Tensorboard self = new Tensorboard();
        return TeaModel.build(map, self);
    }

    public Tensorboard setTensorboardId(String tensorboardId) {
        this.tensorboardId = tensorboardId;
        return this;
    }
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    public Tensorboard setTensorboardUrl(String tensorboardUrl) {
        this.tensorboardUrl = tensorboardUrl;
        return this;
    }
    public String getTensorboardUrl() {
        return this.tensorboardUrl;
    }

    public Tensorboard setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Tensorboard setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public Tensorboard setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Tensorboard setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public Tensorboard setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Tensorboard setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Tensorboard setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public Tensorboard setSummaryPath(String summaryPath) {
        this.summaryPath = summaryPath;
        return this;
    }
    public String getSummaryPath() {
        return this.summaryPath;
    }

    public Tensorboard setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public Tensorboard setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public Tensorboard setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public Tensorboard setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}

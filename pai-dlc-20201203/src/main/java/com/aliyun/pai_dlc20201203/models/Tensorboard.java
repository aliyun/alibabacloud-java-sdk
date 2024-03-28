// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Tensorboard extends TeaModel {
    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("ReasonCode")
    public String reasonCode;

    @NameInMap("ReasonMessage")
    public String reasonMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("SummaryPath")
    public String summaryPath;

    @NameInMap("TensorboardDataSources")
    public java.util.List<TensorboardDataSourceSpec> tensorboardDataSources;

    @NameInMap("TensorboardId")
    public String tensorboardId;

    @NameInMap("TensorboardSpec")
    public TensorboardSpec tensorboardSpec;

    @NameInMap("TensorboardUrl")
    public String tensorboardUrl;

    @NameInMap("UserId")
    public String userId;

    public static Tensorboard build(java.util.Map<String, ?> map) throws Exception {
        Tensorboard self = new Tensorboard();
        return TeaModel.build(map, self);
    }

    public Tensorboard setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public Tensorboard setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
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

    public Tensorboard setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
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

    public Tensorboard setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Tensorboard setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Tensorboard setSummaryPath(String summaryPath) {
        this.summaryPath = summaryPath;
        return this;
    }
    public String getSummaryPath() {
        return this.summaryPath;
    }

    public Tensorboard setTensorboardDataSources(java.util.List<TensorboardDataSourceSpec> tensorboardDataSources) {
        this.tensorboardDataSources = tensorboardDataSources;
        return this;
    }
    public java.util.List<TensorboardDataSourceSpec> getTensorboardDataSources() {
        return this.tensorboardDataSources;
    }

    public Tensorboard setTensorboardId(String tensorboardId) {
        this.tensorboardId = tensorboardId;
        return this;
    }
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    public Tensorboard setTensorboardSpec(TensorboardSpec tensorboardSpec) {
        this.tensorboardSpec = tensorboardSpec;
        return this;
    }
    public TensorboardSpec getTensorboardSpec() {
        return this.tensorboardSpec;
    }

    public Tensorboard setTensorboardUrl(String tensorboardUrl) {
        this.tensorboardUrl = tensorboardUrl;
        return this;
    }
    public String getTensorboardUrl() {
        return this.tensorboardUrl;
    }

    public Tensorboard setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

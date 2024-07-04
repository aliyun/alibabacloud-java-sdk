// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Tensorboard extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>datasource-test</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:00Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:00Z</p>
     */
    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:00Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    /**
     * <strong>example:</strong>
     * <p>dlc-20210114104214-vf9lowjt3pso</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>Delete by user</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <strong>example:</strong>
     * <p>Tensorboard is deleted</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>/root/data</p>
     */
    @NameInMap("SummaryPath")
    public String summaryPath;

    @NameInMap("TensorboardDataSources")
    public java.util.List<TensorboardDataSourceSpec> tensorboardDataSources;

    /**
     * <strong>example:</strong>
     * <p>tensorboard-xxx</p>
     */
    @NameInMap("TensorboardId")
    public String tensorboardId;

    @NameInMap("TensorboardSpec")
    public TensorboardSpec tensorboardSpec;

    /**
     * <strong>example:</strong>
     * <p><a href="http://xxxxxx">http://xxxxxx</a></p>
     */
    @NameInMap("TensorboardUrl")
    public String tensorboardUrl;

    /**
     * <strong>example:</strong>
     * <p>lycxxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>tensorboard.pai</p>
     */
    @NameInMap("Username")
    public String username;

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

    public Tensorboard setGmtFinishTime(String gmtFinishTime) {
        this.gmtFinishTime = gmtFinishTime;
        return this;
    }
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
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

    public Tensorboard setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}

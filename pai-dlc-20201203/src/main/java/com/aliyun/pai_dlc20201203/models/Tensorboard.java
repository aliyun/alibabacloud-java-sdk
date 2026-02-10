// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Tensorboard extends TeaModel {
    /**
     * <p>The visibility.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The CPU resources.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Cpu")
    public Long cpu;

    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>datasource-test</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The dataset type.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The run duration (seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The create time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:00Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The end time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    /**
     * <p>The modify time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:00Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-20210114104214-vf9lowjt3pso</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The maximum run time (minutes).</p>
     * 
     * <strong>example:</strong>
     * <p>240</p>
     */
    @NameInMap("MaxRunningTimeMinutes")
    public Long maxRunningTimeMinutes;

    /**
     * <p>The memory size (GB).</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Memory")
    public Long memory;

    /**
     * <p>The extended fields of the dataset are in the JSON format. mountpath: the path to mount the custom dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;mountpath&quot;:&quot;/root/data/&quot;}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The priority of the TensorBoard job.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The resource group ID used by TensorBoard.</p>
     * 
     * <strong>example:</strong>
     * <p>quota12***</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The name of the resource quota used by TensorBoard.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-quota</p>
     */
    @NameInMap("QuotaName")
    public String quotaName;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Delete by user</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <p>The status details.</p>
     * 
     * <strong>example:</strong>
     * <p>Tensorboard is deleted</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The file path.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/data</p>
     */
    @NameInMap("SummaryPath")
    public String summaryPath;

    /**
     * <p>The relative path of Summary.</p>
     * 
     * <strong>example:</strong>
     * <p>/summary/</p>
     */
    @NameInMap("SummaryRelativePath")
    public String summaryRelativePath;

    /**
     * <p>The mounted dataset for the TensorBoard job.</p>
     */
    @NameInMap("TensorboardDataSources")
    public java.util.List<TensorboardDataSourceSpec> tensorboardDataSources;

    /**
     * <p>The TensorBoard ID</p>
     * 
     * <strong>example:</strong>
     * <p>tensorboard-xxx</p>
     */
    @NameInMap("TensorboardId")
    public String tensorboardId;

    /**
     * <p>The pay-as-you-go configurations for the TensorBoard job.</p>
     */
    @NameInMap("TensorboardSpec")
    public TensorboardSpec tensorboardSpec;

    /**
     * <p>The TensorBoard URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxxxx">http://xxxxxx</a></p>
     */
    @NameInMap("TensorboardUrl")
    public String tensorboardUrl;

    /**
     * <p>The value of the token.</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The ID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>lycxxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The username of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>tensorboard.pai</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Tensorboard build(java.util.Map<String, ?> map) throws Exception {
        Tensorboard self = new Tensorboard();
        return TeaModel.build(map, self);
    }

    public Tensorboard setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Tensorboard setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public Tensorboard setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public Tensorboard setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
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

    public Tensorboard setMaxRunningTimeMinutes(Long maxRunningTimeMinutes) {
        this.maxRunningTimeMinutes = maxRunningTimeMinutes;
        return this;
    }
    public Long getMaxRunningTimeMinutes() {
        return this.maxRunningTimeMinutes;
    }

    public Tensorboard setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public Tensorboard setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public Tensorboard setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public Tensorboard setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public Tensorboard setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
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

    public Tensorboard setSummaryRelativePath(String summaryRelativePath) {
        this.summaryRelativePath = summaryRelativePath;
        return this;
    }
    public String getSummaryRelativePath() {
        return this.summaryRelativePath;
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

    public Tensorboard setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
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

    public Tensorboard setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

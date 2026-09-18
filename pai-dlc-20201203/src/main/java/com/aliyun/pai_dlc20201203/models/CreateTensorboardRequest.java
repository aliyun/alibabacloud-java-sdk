// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateTensorboardRequest extends TeaModel {
    /**
     * <p>The visibility of the job. Valid values:</p>
     * <ul>
     * <li>PUBLIC: Visible to all members in the workspace.</li>
     * <li>PRIVATE: Visible only to you and administrators in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The number of CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Cpu")
    public Long cpu;

    /**
     * <p>The dataset ID. &lt;props=&quot;china&quot;&gt;For information about how to obtain the dataset ID, see <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>d-xxxxxxxx</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The dataset type. Valid values:</p>
     * <ul>
     * <li>OSS</li>
     * <li>NAS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The datasource configurations.</p>
     */
    @NameInMap("DataSources")
    public java.util.List<DataSourceItem> dataSources;

    /**
     * <p>The TensorBoard name.</p>
     * 
     * <strong>example:</strong>
     * <p>tensorboard</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The job ID. For information about how to obtain the job ID, see <a href="https://help.aliyun.com/document_detail/459676.html">ListJobs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-20210126170216-mtl37ge7gkvdz</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The maximum running duration. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>240</p>
     */
    @NameInMap("MaxRunningTimeMinutes")
    public Long maxRunningTimeMinutes;

    /**
     * <p>The memory size. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Memory")
    public Long memory;

    /**
     * <p>The extended field of custom dataset in JSON format. Currently, MountPath is supported, which specifies the custom mount path of custom dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;mountpath&quot;:&quot;/root/data/&quot;}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The priority of the job. This is an optional parameter. Default value: 1. Valid values: 1 to 9.</p>
     * <ul>
     * <li>1: the lowest priority.</li>
     * <li>9: the highest priority.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The resource quota ID. This parameter is required when you create a TensorBoard job by using resources from a resource quota. &lt;props=&quot;china&quot;&gt;For information about how to obtain the resource quota ID, see <a href="https://help.aliyun.com/document_detail/2628071.html">ListQuotas</a>.
     * &lt;props=&quot;china&quot;&gt;Published only on China site.
     * Currently, only whitelisted users can create TensorBoard jobs by using resource quota resources. To use this feature, contact us.</p>
     * 
     * <strong>example:</strong>
     * <p>quota12345</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-xxxxxx</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type.</p>
     * 
     * <strong>example:</strong>
     * <p>job</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The summary directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/data/</p>
     */
    @NameInMap("SummaryPath")
    public String summaryPath;

    /**
     * <p>The summary relative directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/summary/</p>
     */
    @NameInMap("SummaryRelativePath")
    public String summaryRelativePath;

    /**
     * <p>The list of dataset configurations mounted to the TensorBoard job.</p>
     */
    @NameInMap("TensorboardDataSources")
    public java.util.List<TensorboardDataSourceSpec> tensorboardDataSources;

    /**
     * <p>The pay-as-you-go configuration for TensorBoard, which is used to create a TensorBoard job that uses pay-as-you-go resources.</p>
     */
    @NameInMap("TensorboardSpec")
    public TensorboardSpec tensorboardSpec;

    /**
     * <p>The URI of the dataset:</p>
     * <ul>
     * <li>If DataSourceType is set to OSS, the format is <code>oss://[oss-bucket].[endpoint]/[path]</code>.</li>
     * <li>If DataSourceType is set to NAS, the format is <code>nas://[nas-filesystem-id].[region]/[path]</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss://.oss-cn-shanghai-finance-1.aliyuncs.com/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The workspace ID. &lt;props=&quot;china&quot;&gt;For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateTensorboardRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTensorboardRequest self = new CreateTensorboardRequest();
        return TeaModel.build(map, self);
    }

    public CreateTensorboardRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateTensorboardRequest setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public CreateTensorboardRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateTensorboardRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateTensorboardRequest setDataSources(java.util.List<DataSourceItem> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<DataSourceItem> getDataSources() {
        return this.dataSources;
    }

    public CreateTensorboardRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateTensorboardRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateTensorboardRequest setMaxRunningTimeMinutes(Long maxRunningTimeMinutes) {
        this.maxRunningTimeMinutes = maxRunningTimeMinutes;
        return this;
    }
    public Long getMaxRunningTimeMinutes() {
        return this.maxRunningTimeMinutes;
    }

    public CreateTensorboardRequest setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public CreateTensorboardRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateTensorboardRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateTensorboardRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public CreateTensorboardRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateTensorboardRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateTensorboardRequest setSummaryPath(String summaryPath) {
        this.summaryPath = summaryPath;
        return this;
    }
    public String getSummaryPath() {
        return this.summaryPath;
    }

    public CreateTensorboardRequest setSummaryRelativePath(String summaryRelativePath) {
        this.summaryRelativePath = summaryRelativePath;
        return this;
    }
    public String getSummaryRelativePath() {
        return this.summaryRelativePath;
    }

    public CreateTensorboardRequest setTensorboardDataSources(java.util.List<TensorboardDataSourceSpec> tensorboardDataSources) {
        this.tensorboardDataSources = tensorboardDataSources;
        return this;
    }
    public java.util.List<TensorboardDataSourceSpec> getTensorboardDataSources() {
        return this.tensorboardDataSources;
    }

    public CreateTensorboardRequest setTensorboardSpec(TensorboardSpec tensorboardSpec) {
        this.tensorboardSpec = tensorboardSpec;
        return this;
    }
    public TensorboardSpec getTensorboardSpec() {
        return this.tensorboardSpec;
    }

    public CreateTensorboardRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public CreateTensorboardRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

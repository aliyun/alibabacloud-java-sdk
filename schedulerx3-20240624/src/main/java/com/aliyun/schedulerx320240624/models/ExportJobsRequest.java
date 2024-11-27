// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ExportJobsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExportJobType")
    public Integer exportJobType;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("JobIds")
    public java.util.List<Long> jobIds;

    public static ExportJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportJobsRequest self = new ExportJobsRequest();
        return TeaModel.build(map, self);
    }

    public ExportJobsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExportJobsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ExportJobsRequest setExportJobType(Integer exportJobType) {
        this.exportJobType = exportJobType;
        return this;
    }
    public Integer getExportJobType() {
        return this.exportJobType;
    }

    public ExportJobsRequest setJobIds(java.util.List<Long> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<Long> getJobIds() {
        return this.jobIds;
    }

}

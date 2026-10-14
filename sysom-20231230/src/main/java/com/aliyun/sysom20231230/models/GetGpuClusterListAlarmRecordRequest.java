// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetGpuClusterListAlarmRecordRequest extends TeaModel {
    /**
     * <p>Query by a specific cluster, such as &quot;cluster1&quot;. To query multiple clusters, separate them with commas: &quot;cluster1,cluster2,cluster3&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;cluster1&quot;</p>
     */
    @NameInMap("alarmCluster")
    public String alarmCluster;

    /**
     * <p>Filter anomalies by instance ID or container.</p>
     * 
     * <strong>example:</strong>
     * <p>instance id</p>
     */
    @NameInMap("alarmExtInfo")
    public String alarmExtInfo;

    /**
     * <p>Query by a specific task, such as &quot;task1&quot;. To query multiple tasks, separate them with commas: &quot;task1,task2,task3&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>task id</p>
     */
    @NameInMap("alarmTask")
    public String alarmTask;

    /**
     * <p>Query by a specific point in time, such as &quot;2025-08-22 18:16:25&quot;. Query by a time range using the &quot;start,end&quot; format, such as &quot;2025-08-22 18:16:25,2025-08-23 18:16:25&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;2025-08-22 18:16:25,2025-08-23 18:16:25&quot;</p>
     */
    @NameInMap("alarmTime")
    public String alarmTime;

    /**
     * <p>Filter by anomaly type, such as GPU memory access out-of-bounds or task hang.</p>
     * 
     * <strong>example:</strong>
     * <p>cuda error</p>
     */
    @NameInMap("alarmType")
    public String alarmType;

    /**
     * <p>The current page number for pagination.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <p>The number of entries per page for pagination.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Filter by task status, such as blocking, running, exited, or restart.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    public static GetGpuClusterListAlarmRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGpuClusterListAlarmRecordRequest self = new GetGpuClusterListAlarmRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetGpuClusterListAlarmRecordRequest setAlarmCluster(String alarmCluster) {
        this.alarmCluster = alarmCluster;
        return this;
    }
    public String getAlarmCluster() {
        return this.alarmCluster;
    }

    public GetGpuClusterListAlarmRecordRequest setAlarmExtInfo(String alarmExtInfo) {
        this.alarmExtInfo = alarmExtInfo;
        return this;
    }
    public String getAlarmExtInfo() {
        return this.alarmExtInfo;
    }

    public GetGpuClusterListAlarmRecordRequest setAlarmTask(String alarmTask) {
        this.alarmTask = alarmTask;
        return this;
    }
    public String getAlarmTask() {
        return this.alarmTask;
    }

    public GetGpuClusterListAlarmRecordRequest setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
        return this;
    }
    public String getAlarmTime() {
        return this.alarmTime;
    }

    public GetGpuClusterListAlarmRecordRequest setAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public String getAlarmType() {
        return this.alarmType;
    }

    public GetGpuClusterListAlarmRecordRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetGpuClusterListAlarmRecordRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetGpuClusterListAlarmRecordRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

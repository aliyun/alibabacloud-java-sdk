// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ETL extends TeaModel {
    /**
     * <p>数据加工配置</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public ETLConfiguration configuration;

    /**
     * <p>创建时间</p>
     * 
     * <strong>example:</strong>
     * <p>1714274900</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>job description</p>
     * 
     * <strong>example:</strong>
     * <p>加工作业</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>job displayName</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>etljob</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>最近一次修改时间</p>
     * 
     * <strong>example:</strong>
     * <p>1714274900</p>
     */
    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>job name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>etl-20240426</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>调度ID</p>
     * 
     * <strong>example:</strong>
     * <p>f0eb655e501a8780808d1970ef6d04c4</p>
     */
    @NameInMap("scheduleId")
    public String scheduleId;

    /**
     * <p>加工状态，表示返回加工任务的状态，取值包括：</p>
     * <ol>
     * <li>RUNNING：运行中</li>
     * <li>STOPPING: 停止中</li>
     * <li>STOPPED: 已停止</li>
     * <li>SUCCEEDED: 运行成功</li>
     * <li>FAILED: 运行失败</li>
     * <li>STARTING：启动中</li>
     * <li>RESTARTING：重启中</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    public static ETL build(java.util.Map<String, ?> map) throws Exception {
        ETL self = new ETL();
        return TeaModel.build(map, self);
    }

    public ETL setConfiguration(ETLConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public ETLConfiguration getConfiguration() {
        return this.configuration;
    }

    public ETL setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ETL setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ETL setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ETL setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public ETL setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ETL setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public ETL setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

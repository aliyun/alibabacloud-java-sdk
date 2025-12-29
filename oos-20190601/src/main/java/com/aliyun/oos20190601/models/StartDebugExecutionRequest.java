// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class StartDebugExecutionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abcde3OARpx77No54nv6</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Service&quot;: &quot;ecs&quot;, &quot;API&quot;: &quot;DescribeRegions&quot;}</p>
     */
    @NameInMap("Properties")
    public String properties;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>ACS::ExecuteAPI</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static StartDebugExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDebugExecutionRequest self = new StartDebugExecutionRequest();
        return TeaModel.build(map, self);
    }

    public StartDebugExecutionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartDebugExecutionRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public StartDebugExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartDebugExecutionRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}

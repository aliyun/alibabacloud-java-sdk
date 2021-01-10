// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSJdbcwriterIopsRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("End")
    public Long end;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JdbcwriterName")
    public String jdbcwriterName;

    @NameInMap("Start")
    public Long start;

    public static GetDWSJdbcwriterIopsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSJdbcwriterIopsRequest self = new GetDWSJdbcwriterIopsRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSJdbcwriterIopsRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetDWSJdbcwriterIopsRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetDWSJdbcwriterIopsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSJdbcwriterIopsRequest setJdbcwriterName(String jdbcwriterName) {
        this.jdbcwriterName = jdbcwriterName;
        return this;
    }
    public String getJdbcwriterName() {
        return this.jdbcwriterName;
    }

    public GetDWSJdbcwriterIopsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}

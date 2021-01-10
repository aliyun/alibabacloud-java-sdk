// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSJdbcwriterDelayRequest extends TeaModel {
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

    public static GetDWSJdbcwriterDelayRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSJdbcwriterDelayRequest self = new GetDWSJdbcwriterDelayRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSJdbcwriterDelayRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetDWSJdbcwriterDelayRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetDWSJdbcwriterDelayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSJdbcwriterDelayRequest setJdbcwriterName(String jdbcwriterName) {
        this.jdbcwriterName = jdbcwriterName;
        return this;
    }
    public String getJdbcwriterName() {
        return this.jdbcwriterName;
    }

    public GetDWSJdbcwriterDelayRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}

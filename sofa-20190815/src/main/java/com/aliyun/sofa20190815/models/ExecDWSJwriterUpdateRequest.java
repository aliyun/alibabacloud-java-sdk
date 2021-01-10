// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecDWSJwriterUpdateRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JdbcwriterTimestamp")
    public Long jdbcwriterTimestamp;

    @NameInMap("WriterName")
    public String writerName;

    public static ExecDWSJwriterUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDWSJwriterUpdateRequest self = new ExecDWSJwriterUpdateRequest();
        return TeaModel.build(map, self);
    }

    public ExecDWSJwriterUpdateRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ExecDWSJwriterUpdateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecDWSJwriterUpdateRequest setJdbcwriterTimestamp(Long jdbcwriterTimestamp) {
        this.jdbcwriterTimestamp = jdbcwriterTimestamp;
        return this;
    }
    public Long getJdbcwriterTimestamp() {
        return this.jdbcwriterTimestamp;
    }

    public ExecDWSJwriterUpdateRequest setWriterName(String writerName) {
        this.writerName = writerName;
        return this;
    }
    public String getWriterName() {
        return this.writerName;
    }

}

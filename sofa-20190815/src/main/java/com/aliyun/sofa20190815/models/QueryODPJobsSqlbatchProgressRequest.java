// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPJobsSqlbatchProgressRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static QueryODPJobsSqlbatchProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryODPJobsSqlbatchProgressRequest self = new QueryODPJobsSqlbatchProgressRequest();
        return TeaModel.build(map, self);
    }

    public QueryODPJobsSqlbatchProgressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryODPJobsSqlbatchProgressRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public QueryODPJobsSqlbatchProgressRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public QueryODPJobsSqlbatchProgressRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}

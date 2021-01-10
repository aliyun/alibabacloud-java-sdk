// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloseODPSqlAuditRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    @NameInMap("SchemasRepeatList")
    public java.util.List<String> schemasRepeatList;

    public static CloseODPSqlAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseODPSqlAuditRequest self = new CloseODPSqlAuditRequest();
        return TeaModel.build(map, self);
    }

    public CloseODPSqlAuditRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CloseODPSqlAuditRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

    public CloseODPSqlAuditRequest setSchemasRepeatList(java.util.List<String> schemasRepeatList) {
        this.schemasRepeatList = schemasRepeatList;
        return this;
    }
    public java.util.List<String> getSchemasRepeatList() {
        return this.schemasRepeatList;
    }

}

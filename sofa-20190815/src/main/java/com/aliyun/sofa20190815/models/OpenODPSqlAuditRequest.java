// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OpenODPSqlAuditRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SchemasRepeatList")
    public java.util.List<String> schemasRepeatList;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static OpenODPSqlAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenODPSqlAuditRequest self = new OpenODPSqlAuditRequest();
        return TeaModel.build(map, self);
    }

    public OpenODPSqlAuditRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OpenODPSqlAuditRequest setSchemasRepeatList(java.util.List<String> schemasRepeatList) {
        this.schemasRepeatList = schemasRepeatList;
        return this;
    }
    public java.util.List<String> getSchemasRepeatList() {
        return this.schemasRepeatList;
    }

    public OpenODPSqlAuditRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}

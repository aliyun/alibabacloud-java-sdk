// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyDataSourceAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AuditMode")
    public String auditMode;

    @NameInMap("ResultAuditMode")
    public String resultAuditMode;

    @NameInMap("ResultAuditMaxLine")
    public Integer resultAuditMaxLine;

    @NameInMap("ResultAuditMaxSize")
    public Integer resultAuditMaxSize;

    @NameInMap("DbIds")
    public java.util.List<String> dbIds;

    public static ModifyDataSourceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceAttributeRequest self = new ModifyDataSourceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDataSourceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDataSourceAttributeRequest setAuditMode(String auditMode) {
        this.auditMode = auditMode;
        return this;
    }
    public String getAuditMode() {
        return this.auditMode;
    }

    public ModifyDataSourceAttributeRequest setResultAuditMode(String resultAuditMode) {
        this.resultAuditMode = resultAuditMode;
        return this;
    }
    public String getResultAuditMode() {
        return this.resultAuditMode;
    }

    public ModifyDataSourceAttributeRequest setResultAuditMaxLine(Integer resultAuditMaxLine) {
        this.resultAuditMaxLine = resultAuditMaxLine;
        return this;
    }
    public Integer getResultAuditMaxLine() {
        return this.resultAuditMaxLine;
    }

    public ModifyDataSourceAttributeRequest setResultAuditMaxSize(Integer resultAuditMaxSize) {
        this.resultAuditMaxSize = resultAuditMaxSize;
        return this;
    }
    public Integer getResultAuditMaxSize() {
        return this.resultAuditMaxSize;
    }

    public ModifyDataSourceAttributeRequest setDbIds(java.util.List<String> dbIds) {
        this.dbIds = dbIds;
        return this;
    }
    public java.util.List<String> getDbIds() {
        return this.dbIds;
    }

}

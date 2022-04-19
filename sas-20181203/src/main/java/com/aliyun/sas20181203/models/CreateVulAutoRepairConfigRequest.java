// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateVulAutoRepairConfigRequest extends TeaModel {
    @NameInMap("Reason")
    public String reason;

    // 漏洞类型
    @NameInMap("Type")
    public String type;

    @NameInMap("VulAutoRepairConfigList")
    public java.util.List<CreateVulAutoRepairConfigRequestVulAutoRepairConfigList> vulAutoRepairConfigList;

    public static CreateVulAutoRepairConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVulAutoRepairConfigRequest self = new CreateVulAutoRepairConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateVulAutoRepairConfigRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CreateVulAutoRepairConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateVulAutoRepairConfigRequest setVulAutoRepairConfigList(java.util.List<CreateVulAutoRepairConfigRequestVulAutoRepairConfigList> vulAutoRepairConfigList) {
        this.vulAutoRepairConfigList = vulAutoRepairConfigList;
        return this;
    }
    public java.util.List<CreateVulAutoRepairConfigRequestVulAutoRepairConfigList> getVulAutoRepairConfigList() {
        return this.vulAutoRepairConfigList;
    }

    public static class CreateVulAutoRepairConfigRequestVulAutoRepairConfigList extends TeaModel {
        // 漏洞别名
        @NameInMap("AliasName")
        public String aliasName;

        // 漏洞名称
        @NameInMap("Name")
        public String name;

        public static CreateVulAutoRepairConfigRequestVulAutoRepairConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreateVulAutoRepairConfigRequestVulAutoRepairConfigList self = new CreateVulAutoRepairConfigRequestVulAutoRepairConfigList();
            return TeaModel.build(map, self);
        }

        public CreateVulAutoRepairConfigRequestVulAutoRepairConfigList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public CreateVulAutoRepairConfigRequestVulAutoRepairConfigList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}

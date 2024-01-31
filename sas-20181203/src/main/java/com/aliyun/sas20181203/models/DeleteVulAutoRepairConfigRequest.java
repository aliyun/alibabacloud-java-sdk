// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVulAutoRepairConfigRequest extends TeaModel {
    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("ConfigIdList")
    public java.util.List<Long> configIdList;

    @NameInMap("Type")
    public String type;

    public static DeleteVulAutoRepairConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVulAutoRepairConfigRequest self = new DeleteVulAutoRepairConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVulAutoRepairConfigRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DeleteVulAutoRepairConfigRequest setConfigIdList(java.util.List<Long> configIdList) {
        this.configIdList = configIdList;
        return this;
    }
    public java.util.List<Long> getConfigIdList() {
        return this.configIdList;
    }

    public DeleteVulAutoRepairConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

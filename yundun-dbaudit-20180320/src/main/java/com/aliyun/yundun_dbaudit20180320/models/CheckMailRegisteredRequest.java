// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CheckMailRegisteredRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mail")
    public String mail;

    public static CheckMailRegisteredRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMailRegisteredRequest self = new CheckMailRegisteredRequest();
        return TeaModel.build(map, self);
    }

    public CheckMailRegisteredRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckMailRegisteredRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CheckMailRegisteredRequest setMail(String mail) {
        this.mail = mail;
        return this;
    }
    public String getMail() {
        return this.mail;
    }

}

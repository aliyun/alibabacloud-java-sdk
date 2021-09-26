// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class RegisterNoticeMailRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mail")
    public String mail;

    @NameInMap("Vcode")
    public String vcode;

    public static RegisterNoticeMailRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterNoticeMailRequest self = new RegisterNoticeMailRequest();
        return TeaModel.build(map, self);
    }

    public RegisterNoticeMailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RegisterNoticeMailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RegisterNoticeMailRequest setMail(String mail) {
        this.mail = mail;
        return this;
    }
    public String getMail() {
        return this.mail;
    }

    public RegisterNoticeMailRequest setVcode(String vcode) {
        this.vcode = vcode;
        return this;
    }
    public String getVcode() {
        return this.vcode;
    }

}

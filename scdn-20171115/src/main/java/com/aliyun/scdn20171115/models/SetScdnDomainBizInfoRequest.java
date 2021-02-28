// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class SetScdnDomainBizInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("DomainName")
    public String domainName;

    public static SetScdnDomainBizInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetScdnDomainBizInfoRequest self = new SetScdnDomainBizInfoRequest();
        return TeaModel.build(map, self);
    }

    public SetScdnDomainBizInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetScdnDomainBizInfoRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public SetScdnDomainBizInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}

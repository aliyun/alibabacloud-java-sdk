// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SetVsStreamsNotifyUrlConfigRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static SetVsStreamsNotifyUrlConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetVsStreamsNotifyUrlConfigRequest self = new SetVsStreamsNotifyUrlConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetVsStreamsNotifyUrlConfigRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SetVsStreamsNotifyUrlConfigRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public SetVsStreamsNotifyUrlConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetVsStreamsNotifyUrlConfigRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SetVsStreamsNotifyUrlConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}

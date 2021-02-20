// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteSubscribeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("SubscribeId")
    public String subscribeId;

    public static DeleteSubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscribeRequest self = new DeleteSubscribeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSubscribeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteSubscribeRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public DeleteSubscribeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteSubscribeRequest setSubscribeId(String subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public String getSubscribeId() {
        return this.subscribeId;
    }

}

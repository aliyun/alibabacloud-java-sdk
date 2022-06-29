// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class StopListenerRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    // update or delete必选, add在custom中生成
    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestContent")
    public String requestContent;

    public static StopListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        StopListenerRequest self = new StopListenerRequest();
        return TeaModel.build(map, self);
    }

    public StopListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StopListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public StopListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public StopListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopListenerRequest setRequestContent(String requestContent) {
        this.requestContent = requestContent;
        return this;
    }
    public String getRequestContent() {
        return this.requestContent;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteMPULayoutRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("LayoutId")
    public Long layoutId;

    public static DeleteMPULayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMPULayoutRequest self = new DeleteMPULayoutRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMPULayoutRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteMPULayoutRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public DeleteMPULayoutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMPULayoutRequest setLayoutId(Long layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public Long getLayoutId() {
        return this.layoutId;
    }

}

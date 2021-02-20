// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeMPULayoutInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("LayoutId")
    public Long layoutId;

    public static DescribeMPULayoutInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPULayoutInfoRequest self = new DescribeMPULayoutInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMPULayoutInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeMPULayoutInfoRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public DescribeMPULayoutInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeMPULayoutInfoRequest setLayoutId(Long layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public Long getLayoutId() {
        return this.layoutId;
    }

}

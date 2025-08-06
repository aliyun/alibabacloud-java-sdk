// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayConfigResponseBody extends TeaModel {
    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("PlayDeviceAbilityList")
    public java.util.List<String> playDeviceAbilityList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPlayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPlayConfigResponseBody self = new GetPlayConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPlayConfigResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetPlayConfigResponseBody setPlayDeviceAbilityList(java.util.List<String> playDeviceAbilityList) {
        this.playDeviceAbilityList = playDeviceAbilityList;
        return this;
    }
    public java.util.List<String> getPlayDeviceAbilityList() {
        return this.playDeviceAbilityList;
    }

    public GetPlayConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

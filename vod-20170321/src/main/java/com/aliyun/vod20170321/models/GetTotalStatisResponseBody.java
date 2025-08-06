// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTotalStatisResponseBody extends TeaModel {
    @NameInMap("NetworkOut")
    public Long networkOut;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageUtilization")
    public Long storageUtilization;

    @NameInMap("TranscodeDuration")
    public Long transcodeDuration;

    public static GetTotalStatisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTotalStatisResponseBody self = new GetTotalStatisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTotalStatisResponseBody setNetworkOut(Long networkOut) {
        this.networkOut = networkOut;
        return this;
    }
    public Long getNetworkOut() {
        return this.networkOut;
    }

    public GetTotalStatisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTotalStatisResponseBody setStorageUtilization(Long storageUtilization) {
        this.storageUtilization = storageUtilization;
        return this;
    }
    public Long getStorageUtilization() {
        return this.storageUtilization;
    }

    public GetTotalStatisResponseBody setTranscodeDuration(Long transcodeDuration) {
        this.transcodeDuration = transcodeDuration;
        return this;
    }
    public Long getTranscodeDuration() {
        return this.transcodeDuration;
    }

}

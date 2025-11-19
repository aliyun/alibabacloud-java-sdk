// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class GenerateWuyingServerSceneUrlResponseBody extends TeaModel {
    @NameInMap("ExpireDurationHours")
    public Integer expireDurationHours;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Url")
    public String url;

    public static GenerateWuyingServerSceneUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateWuyingServerSceneUrlResponseBody self = new GenerateWuyingServerSceneUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateWuyingServerSceneUrlResponseBody setExpireDurationHours(Integer expireDurationHours) {
        this.expireDurationHours = expireDurationHours;
        return this;
    }
    public Integer getExpireDurationHours() {
        return this.expireDurationHours;
    }

    public GenerateWuyingServerSceneUrlResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GenerateWuyingServerSceneUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateWuyingServerSceneUrlResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopRecordStreamRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PlayDomain")
    public String playDomain;

    public static StopRecordStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        StopRecordStreamRequest self = new StopRecordStreamRequest();
        return TeaModel.build(map, self);
    }

    public StopRecordStreamRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public StopRecordStreamRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StopRecordStreamRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StopRecordStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopRecordStreamRequest setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

}

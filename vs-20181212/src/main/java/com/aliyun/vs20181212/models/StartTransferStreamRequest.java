// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartTransferStreamRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("Id")
    public String id;

    @NameInMap("Url")
    public String url;

    @NameInMap("Transcode")
    public String transcode;

    public static StartTransferStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTransferStreamRequest self = new StartTransferStreamRequest();
        return TeaModel.build(map, self);
    }

    public StartTransferStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartTransferStreamRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public StartTransferStreamRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StartTransferStreamRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public StartTransferStreamRequest setTranscode(String transcode) {
        this.transcode = transcode;
        return this;
    }
    public String getTranscode() {
        return this.transcode;
    }

}

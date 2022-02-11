// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMediaInfoRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    // 媒资Id
    @NameInMap("MediaId")
    public String mediaId;

    public static DeleteMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaInfoRequest self = new DeleteMediaInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMediaInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMediaInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}

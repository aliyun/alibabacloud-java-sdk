// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddDeletionAudioTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    public static AddDeletionAudioTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDeletionAudioTaskResponse self = new AddDeletionAudioTaskResponse();
        return TeaModel.build(map, self);
    }

    public AddDeletionAudioTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDeletionAudioTaskResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}

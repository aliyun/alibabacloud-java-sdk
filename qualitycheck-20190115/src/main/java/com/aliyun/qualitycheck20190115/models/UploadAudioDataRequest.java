// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadAudioDataRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UploadAudioDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAudioDataRequest self = new UploadAudioDataRequest();
        return TeaModel.build(map, self);
    }

    public UploadAudioDataRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}

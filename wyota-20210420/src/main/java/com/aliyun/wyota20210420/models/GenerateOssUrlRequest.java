// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GenerateOssUrlRequest extends TeaModel {
    @NameInMap("ObjectNameList")
    public java.util.List<String> objectNameList;

    @NameInMap("SessionId")
    public String sessionId;

    public static GenerateOssUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateOssUrlRequest self = new GenerateOssUrlRequest();
        return TeaModel.build(map, self);
    }

    public GenerateOssUrlRequest setObjectNameList(java.util.List<String> objectNameList) {
        this.objectNameList = objectNameList;
        return this;
    }
    public java.util.List<String> getObjectNameList() {
        return this.objectNameList;
    }

    public GenerateOssUrlRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}

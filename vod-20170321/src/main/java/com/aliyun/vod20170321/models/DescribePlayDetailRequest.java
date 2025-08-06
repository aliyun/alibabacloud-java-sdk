// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayDetailRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("PlayTs")
    public String playTs;

    @NameInMap("SessionId")
    public String sessionId;

    public static DescribePlayDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayDetailRequest self = new DescribePlayDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayDetailRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribePlayDetailRequest setPlayTs(String playTs) {
        this.playTs = playTs;
        return this;
    }
    public String getPlayTs() {
        return this.playTs;
    }

    public DescribePlayDetailRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}

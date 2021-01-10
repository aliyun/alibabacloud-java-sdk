// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeUnlockprojectvariableRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Key")
    public String key;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeUnlockprojectvariableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeUnlockprojectvariableRequest self = new QueryLinkeantcodeAntcodeUnlockprojectvariableRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeUnlockprojectvariableRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeUnlockprojectvariableRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public QueryLinkeantcodeAntcodeUnlockprojectvariableRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}

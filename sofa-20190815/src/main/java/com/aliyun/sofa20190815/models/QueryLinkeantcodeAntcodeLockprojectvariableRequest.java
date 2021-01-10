// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeLockprojectvariableRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Key")
    public String key;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeLockprojectvariableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeLockprojectvariableRequest self = new QueryLinkeantcodeAntcodeLockprojectvariableRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeLockprojectvariableRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeLockprojectvariableRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public QueryLinkeantcodeAntcodeLockprojectvariableRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeleteprojectvariableRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Key")
    public String key;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeDeleteprojectvariableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeleteprojectvariableRequest self = new DeleteLinkeantcodeAntcodeDeleteprojectvariableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectvariableRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectvariableRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectvariableRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}

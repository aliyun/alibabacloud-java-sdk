// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeUsergpgkeyRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static AddLinkeantcodeAntcodeUsergpgkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeUsergpgkeyRequest self = new AddLinkeantcodeAntcodeUsergpgkeyRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeUsergpgkeyRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AddLinkeantcodeAntcodeUsergpgkeyRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}

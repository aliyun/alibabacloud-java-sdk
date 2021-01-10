// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeUserkeysRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Title")
    public String title;

    public static CreateLinkeantcodeAntcodeUserkeysRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeUserkeysRequest self = new CreateLinkeantcodeAntcodeUserkeysRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeUserkeysRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateLinkeantcodeAntcodeUserkeysRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public CreateLinkeantcodeAntcodeUserkeysRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}

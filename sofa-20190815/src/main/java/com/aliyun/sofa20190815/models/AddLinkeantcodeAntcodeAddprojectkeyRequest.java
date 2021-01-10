// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeAddprojectkeyRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Key")
    public String key;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Title")
    public String title;

    public static AddLinkeantcodeAntcodeAddprojectkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeAddprojectkeyRequest self = new AddLinkeantcodeAntcodeAddprojectkeyRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeAddprojectkeyRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddLinkeantcodeAntcodeAddprojectkeyRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AddLinkeantcodeAntcodeAddprojectkeyRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public AddLinkeantcodeAntcodeAddprojectkeyRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}

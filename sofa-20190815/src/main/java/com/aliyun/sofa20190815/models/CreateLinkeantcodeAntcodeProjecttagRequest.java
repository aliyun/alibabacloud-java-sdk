// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeProjecttagRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Message")
    public String message;

    @NameInMap("Ref")
    public String ref;

    @NameInMap("ReleaseDescription")
    public String releaseDescription;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("TagName")
    public String tagName;

    public static CreateLinkeantcodeAntcodeProjecttagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeProjecttagRequest self = new CreateLinkeantcodeAntcodeProjecttagRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeProjecttagRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeProjecttagRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLinkeantcodeAntcodeProjecttagRequest setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public CreateLinkeantcodeAntcodeProjecttagRequest setReleaseDescription(String releaseDescription) {
        this.releaseDescription = releaseDescription;
        return this;
    }
    public String getReleaseDescription() {
        return this.releaseDescription;
    }

    public CreateLinkeantcodeAntcodeProjecttagRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public CreateLinkeantcodeAntcodeProjecttagRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}

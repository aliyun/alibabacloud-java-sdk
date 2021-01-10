// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Path")
    public String path;

    @NameInMap("Ref")
    public String ref;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidRequest self = new CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidRequest setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}

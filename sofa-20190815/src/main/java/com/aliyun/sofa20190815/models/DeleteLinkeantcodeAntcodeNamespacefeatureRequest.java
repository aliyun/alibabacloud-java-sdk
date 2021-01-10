// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeNamespacefeatureRequest extends TeaModel {
    @NameInMap("FeatureType")
    public String featureType;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeNamespacefeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeNamespacefeatureRequest self = new DeleteLinkeantcodeAntcodeNamespacefeatureRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeNamespacefeatureRequest setFeatureType(String featureType) {
        this.featureType = featureType;
        return this;
    }
    public String getFeatureType() {
        return this.featureType;
    }

    public DeleteLinkeantcodeAntcodeNamespacefeatureRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeNamespacefeatureRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}

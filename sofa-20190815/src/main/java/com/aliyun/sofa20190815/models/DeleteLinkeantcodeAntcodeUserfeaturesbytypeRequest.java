// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeUserfeaturesbytypeRequest extends TeaModel {
    @NameInMap("FeatureType")
    public String featureType;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeUserfeaturesbytypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeUserfeaturesbytypeRequest self = new DeleteLinkeantcodeAntcodeUserfeaturesbytypeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeUserfeaturesbytypeRequest setFeatureType(String featureType) {
        this.featureType = featureType;
        return this;
    }
    public String getFeatureType() {
        return this.featureType;
    }

    public DeleteLinkeantcodeAntcodeUserfeaturesbytypeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeUserfeaturesbytypeRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}

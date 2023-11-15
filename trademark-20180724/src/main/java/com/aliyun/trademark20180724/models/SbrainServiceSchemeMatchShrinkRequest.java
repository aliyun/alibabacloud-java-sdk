// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbrainServiceSchemeMatchShrinkRequest extends TeaModel {
    @NameInMap("MatchParams")
    public String matchParamsShrink;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ReferenceNo")
    public String referenceNo;

    @NameInMap("ReferenceType")
    public String referenceType;

    @NameInMap("SceneCode")
    public String sceneCode;

    @NameInMap("Source")
    public String source;

    public static SbrainServiceSchemeMatchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SbrainServiceSchemeMatchShrinkRequest self = new SbrainServiceSchemeMatchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SbrainServiceSchemeMatchShrinkRequest setMatchParamsShrink(String matchParamsShrink) {
        this.matchParamsShrink = matchParamsShrink;
        return this;
    }
    public String getMatchParamsShrink() {
        return this.matchParamsShrink;
    }

    public SbrainServiceSchemeMatchShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SbrainServiceSchemeMatchShrinkRequest setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
        return this;
    }
    public String getReferenceNo() {
        return this.referenceNo;
    }

    public SbrainServiceSchemeMatchShrinkRequest setReferenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }
    public String getReferenceType() {
        return this.referenceType;
    }

    public SbrainServiceSchemeMatchShrinkRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public SbrainServiceSchemeMatchShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}

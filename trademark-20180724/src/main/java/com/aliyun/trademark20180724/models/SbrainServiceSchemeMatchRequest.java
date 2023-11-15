// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbrainServiceSchemeMatchRequest extends TeaModel {
    @NameInMap("MatchParams")
    public java.util.Map<String, ?> matchParams;

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

    public static SbrainServiceSchemeMatchRequest build(java.util.Map<String, ?> map) throws Exception {
        SbrainServiceSchemeMatchRequest self = new SbrainServiceSchemeMatchRequest();
        return TeaModel.build(map, self);
    }

    public SbrainServiceSchemeMatchRequest setMatchParams(java.util.Map<String, ?> matchParams) {
        this.matchParams = matchParams;
        return this;
    }
    public java.util.Map<String, ?> getMatchParams() {
        return this.matchParams;
    }

    public SbrainServiceSchemeMatchRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SbrainServiceSchemeMatchRequest setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
        return this;
    }
    public String getReferenceNo() {
        return this.referenceNo;
    }

    public SbrainServiceSchemeMatchRequest setReferenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }
    public String getReferenceType() {
        return this.referenceType;
    }

    public SbrainServiceSchemeMatchRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public SbrainServiceSchemeMatchRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}

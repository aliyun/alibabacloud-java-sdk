// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbrainServiceExecuteShrinkRequest extends TeaModel {
    @NameInMap("ExecuteParams")
    public String executeParamsShrink;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ReferenceNo")
    public String referenceNo;

    @NameInMap("ReferenceType")
    public String referenceType;

    @NameInMap("SceneCode")
    public String sceneCode;

    @NameInMap("SchemeId")
    public Long schemeId;

    @NameInMap("ServicePlace")
    public String servicePlace;

    @NameInMap("Source")
    public String source;

    @NameInMap("Target")
    public String target;

    public static SbrainServiceExecuteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SbrainServiceExecuteShrinkRequest self = new SbrainServiceExecuteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SbrainServiceExecuteShrinkRequest setExecuteParamsShrink(String executeParamsShrink) {
        this.executeParamsShrink = executeParamsShrink;
        return this;
    }
    public String getExecuteParamsShrink() {
        return this.executeParamsShrink;
    }

    public SbrainServiceExecuteShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SbrainServiceExecuteShrinkRequest setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
        return this;
    }
    public String getReferenceNo() {
        return this.referenceNo;
    }

    public SbrainServiceExecuteShrinkRequest setReferenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }
    public String getReferenceType() {
        return this.referenceType;
    }

    public SbrainServiceExecuteShrinkRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public SbrainServiceExecuteShrinkRequest setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
        return this;
    }
    public Long getSchemeId() {
        return this.schemeId;
    }

    public SbrainServiceExecuteShrinkRequest setServicePlace(String servicePlace) {
        this.servicePlace = servicePlace;
        return this;
    }
    public String getServicePlace() {
        return this.servicePlace;
    }

    public SbrainServiceExecuteShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SbrainServiceExecuteShrinkRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}

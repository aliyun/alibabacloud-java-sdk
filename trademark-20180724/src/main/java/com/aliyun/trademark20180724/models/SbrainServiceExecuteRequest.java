// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbrainServiceExecuteRequest extends TeaModel {
    @NameInMap("ExecuteParams")
    public java.util.Map<String, ?> executeParams;

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

    public static SbrainServiceExecuteRequest build(java.util.Map<String, ?> map) throws Exception {
        SbrainServiceExecuteRequest self = new SbrainServiceExecuteRequest();
        return TeaModel.build(map, self);
    }

    public SbrainServiceExecuteRequest setExecuteParams(java.util.Map<String, ?> executeParams) {
        this.executeParams = executeParams;
        return this;
    }
    public java.util.Map<String, ?> getExecuteParams() {
        return this.executeParams;
    }

    public SbrainServiceExecuteRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SbrainServiceExecuteRequest setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
        return this;
    }
    public String getReferenceNo() {
        return this.referenceNo;
    }

    public SbrainServiceExecuteRequest setReferenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }
    public String getReferenceType() {
        return this.referenceType;
    }

    public SbrainServiceExecuteRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public SbrainServiceExecuteRequest setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
        return this;
    }
    public Long getSchemeId() {
        return this.schemeId;
    }

    public SbrainServiceExecuteRequest setServicePlace(String servicePlace) {
        this.servicePlace = servicePlace;
        return this;
    }
    public String getServicePlace() {
        return this.servicePlace;
    }

    public SbrainServiceExecuteRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SbrainServiceExecuteRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}

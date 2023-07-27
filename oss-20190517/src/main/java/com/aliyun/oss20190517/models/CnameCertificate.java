// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CnameCertificate extends TeaModel {
    @NameInMap("CertId")
    public String certId;

    @NameInMap("CreationDate")
    public String creationDate;

    @NameInMap("Fingerprint")
    public String fingerprint;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    @NameInMap("ValidEndDate")
    public String validEndDate;

    @NameInMap("ValidStartDate")
    public String validStartDate;

    public static CnameCertificate build(java.util.Map<String, ?> map) throws Exception {
        CnameCertificate self = new CnameCertificate();
        return TeaModel.build(map, self);
    }

    public CnameCertificate setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public CnameCertificate setCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }
    public String getCreationDate() {
        return this.creationDate;
    }

    public CnameCertificate setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public CnameCertificate setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CnameCertificate setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CnameCertificate setValidEndDate(String validEndDate) {
        this.validEndDate = validEndDate;
        return this;
    }
    public String getValidEndDate() {
        return this.validEndDate;
    }

    public CnameCertificate setValidStartDate(String validStartDate) {
        this.validStartDate = validStartDate;
        return this;
    }
    public String getValidStartDate() {
        return this.validStartDate;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CnameInfo extends TeaModel {
    @NameInMap("Certificate")
    public CnameCertificate certificate;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("LastModified")
    public String lastModified;

    @NameInMap("Status")
    public String status;

    public static CnameInfo build(java.util.Map<String, ?> map) throws Exception {
        CnameInfo self = new CnameInfo();
        return TeaModel.build(map, self);
    }

    public CnameInfo setCertificate(CnameCertificate certificate) {
        this.certificate = certificate;
        return this;
    }
    public CnameCertificate getCertificate() {
        return this.certificate;
    }

    public CnameInfo setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CnameInfo setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

    public CnameInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

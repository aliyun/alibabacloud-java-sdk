// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgx_dcap_server20200726.models;

import com.aliyun.tea.*;

public class SimplePackagePckCertRequest extends TeaModel {
    @NameInMap("cpusvn")
    public String cpusvn;

    @NameInMap("encrypted_ppid")
    public String encryptedPpid;

    @NameInMap("pceid")
    public String pceid;

    @NameInMap("pcesvn")
    public String pcesvn;

    @NameInMap("qeid")
    public String qeid;

    public static SimplePackagePckCertRequest build(java.util.Map<String, ?> map) throws Exception {
        SimplePackagePckCertRequest self = new SimplePackagePckCertRequest();
        return TeaModel.build(map, self);
    }

    public SimplePackagePckCertRequest setCpusvn(String cpusvn) {
        this.cpusvn = cpusvn;
        return this;
    }
    public String getCpusvn() {
        return this.cpusvn;
    }

    public SimplePackagePckCertRequest setEncryptedPpid(String encryptedPpid) {
        this.encryptedPpid = encryptedPpid;
        return this;
    }
    public String getEncryptedPpid() {
        return this.encryptedPpid;
    }

    public SimplePackagePckCertRequest setPceid(String pceid) {
        this.pceid = pceid;
        return this;
    }
    public String getPceid() {
        return this.pceid;
    }

    public SimplePackagePckCertRequest setPcesvn(String pcesvn) {
        this.pcesvn = pcesvn;
        return this;
    }
    public String getPcesvn() {
        return this.pcesvn;
    }

    public SimplePackagePckCertRequest setQeid(String qeid) {
        this.qeid = qeid;
        return this;
    }
    public String getQeid() {
        return this.qeid;
    }

}

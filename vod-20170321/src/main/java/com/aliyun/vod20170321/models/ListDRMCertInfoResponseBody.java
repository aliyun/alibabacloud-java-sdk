// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDRMCertInfoResponseBody extends TeaModel {
    @NameInMap("DRMCertInfoList")
    public java.util.List<ListDRMCertInfoResponseBodyDRMCertInfoList> DRMCertInfoList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDRMCertInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDRMCertInfoResponseBody self = new ListDRMCertInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDRMCertInfoResponseBody setDRMCertInfoList(java.util.List<ListDRMCertInfoResponseBodyDRMCertInfoList> DRMCertInfoList) {
        this.DRMCertInfoList = DRMCertInfoList;
        return this;
    }
    public java.util.List<ListDRMCertInfoResponseBodyDRMCertInfoList> getDRMCertInfoList() {
        return this.DRMCertInfoList;
    }

    public ListDRMCertInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDRMCertInfoResponseBodyDRMCertInfoList extends TeaModel {
        @NameInMap("Ask")
        public String ask;

        @NameInMap("CertId")
        public String certId;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DRMType")
        public String DRMType;

        @NameInMap("Description")
        public String description;

        @NameInMap("PassPhrase")
        public String passPhrase;

        @NameInMap("PrivateKey")
        public String privateKey;

        @NameInMap("ServCert")
        public String servCert;

        public static ListDRMCertInfoResponseBodyDRMCertInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListDRMCertInfoResponseBodyDRMCertInfoList self = new ListDRMCertInfoResponseBodyDRMCertInfoList();
            return TeaModel.build(map, self);
        }

        public ListDRMCertInfoResponseBodyDRMCertInfoList setAsk(String ask) {
            this.ask = ask;
            return this;
        }
        public String getAsk() {
            return this.ask;
        }

        public ListDRMCertInfoResponseBodyDRMCertInfoList setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public ListDRMCertInfoResponseBodyDRMCertInfoList setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public ListDRMCertInfoResponseBodyDRMCertInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListDRMCertInfoResponseBodyDRMCertInfoList setDRMType(String DRMType) {
            this.DRMType = DRMType;
            return this;
        }
        public String getDRMType() {
            return this.DRMType;
        }

        public ListDRMCertInfoResponseBodyDRMCertInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDRMCertInfoResponseBodyDRMCertInfoList setPassPhrase(String passPhrase) {
            this.passPhrase = passPhrase;
            return this;
        }
        public String getPassPhrase() {
            return this.passPhrase;
        }

        public ListDRMCertInfoResponseBodyDRMCertInfoList setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

        public ListDRMCertInfoResponseBodyDRMCertInfoList setServCert(String servCert) {
            this.servCert = servCert;
            return this;
        }
        public String getServCert() {
            return this.servCert;
        }

    }

}

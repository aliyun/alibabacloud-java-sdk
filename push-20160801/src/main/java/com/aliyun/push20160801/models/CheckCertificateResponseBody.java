// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CheckCertificateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Android")
    public Boolean android;

    @NameInMap("DevelopmentCertInfo")
    public CheckCertificateResponseBodyDevelopmentCertInfo developmentCertInfo;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IOS")
    public Boolean IOS;

    @NameInMap("ProductionCertInfo")
    public CheckCertificateResponseBodyProductionCertInfo productionCertInfo;

    /**
     * <strong>example:</strong>
     * <p>9998B3CC-ED9E-4CB3-A8FB-DCC61296BFBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCertificateResponseBody self = new CheckCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCertificateResponseBody setAndroid(Boolean android) {
        this.android = android;
        return this;
    }
    public Boolean getAndroid() {
        return this.android;
    }

    public CheckCertificateResponseBody setDevelopmentCertInfo(CheckCertificateResponseBodyDevelopmentCertInfo developmentCertInfo) {
        this.developmentCertInfo = developmentCertInfo;
        return this;
    }
    public CheckCertificateResponseBodyDevelopmentCertInfo getDevelopmentCertInfo() {
        return this.developmentCertInfo;
    }

    public CheckCertificateResponseBody setIOS(Boolean IOS) {
        this.IOS = IOS;
        return this;
    }
    public Boolean getIOS() {
        return this.IOS;
    }

    public CheckCertificateResponseBody setProductionCertInfo(CheckCertificateResponseBodyProductionCertInfo productionCertInfo) {
        this.productionCertInfo = productionCertInfo;
        return this;
    }
    public CheckCertificateResponseBodyProductionCertInfo getProductionCertInfo() {
        return this.productionCertInfo;
    }

    public CheckCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckCertificateResponseBodyDevelopmentCertInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1470024000000</p>
         */
        @NameInMap("ExipreTime")
        public Long exipreTime;

        /**
         * <strong>example:</strong>
         * <p>EXPIRED</p>
         */
        @NameInMap("Status")
        public String status;

        public static CheckCertificateResponseBodyDevelopmentCertInfo build(java.util.Map<String, ?> map) throws Exception {
            CheckCertificateResponseBodyDevelopmentCertInfo self = new CheckCertificateResponseBodyDevelopmentCertInfo();
            return TeaModel.build(map, self);
        }

        public CheckCertificateResponseBodyDevelopmentCertInfo setExipreTime(Long exipreTime) {
            this.exipreTime = exipreTime;
            return this;
        }
        public Long getExipreTime() {
            return this.exipreTime;
        }

        public CheckCertificateResponseBodyDevelopmentCertInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CheckCertificateResponseBodyProductionCertInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1764561600000</p>
         */
        @NameInMap("ExipreTime")
        public Long exipreTime;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Status")
        public String status;

        public static CheckCertificateResponseBodyProductionCertInfo build(java.util.Map<String, ?> map) throws Exception {
            CheckCertificateResponseBodyProductionCertInfo self = new CheckCertificateResponseBodyProductionCertInfo();
            return TeaModel.build(map, self);
        }

        public CheckCertificateResponseBodyProductionCertInfo setExipreTime(Long exipreTime) {
            this.exipreTime = exipreTime;
            return this;
        }
        public Long getExipreTime() {
            return this.exipreTime;
        }

        public CheckCertificateResponseBodyProductionCertInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

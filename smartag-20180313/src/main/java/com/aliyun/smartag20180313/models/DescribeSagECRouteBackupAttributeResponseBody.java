// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagECRouteBackupAttributeResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("HcIp")
    public String hcIp;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExpressConnectionInterface")
    public String expressConnectionInterface;

    @NameInMap("RouteBackup")
    public Boolean routeBackup;

    @NameInMap("ExpressConnectionNexthop")
    public String expressConnectionNexthop;

    @NameInMap("SagId")
    public String sagId;

    @NameInMap("Cidrs")
    public DescribeSagECRouteBackupAttributeResponseBodyCidrs cidrs;

    public static DescribeSagECRouteBackupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagECRouteBackupAttributeResponseBody self = new DescribeSagECRouteBackupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagECRouteBackupAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSagECRouteBackupAttributeResponseBody setHcIp(String hcIp) {
        this.hcIp = hcIp;
        return this;
    }
    public String getHcIp() {
        return this.hcIp;
    }

    public DescribeSagECRouteBackupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagECRouteBackupAttributeResponseBody setExpressConnectionInterface(String expressConnectionInterface) {
        this.expressConnectionInterface = expressConnectionInterface;
        return this;
    }
    public String getExpressConnectionInterface() {
        return this.expressConnectionInterface;
    }

    public DescribeSagECRouteBackupAttributeResponseBody setRouteBackup(Boolean routeBackup) {
        this.routeBackup = routeBackup;
        return this;
    }
    public Boolean getRouteBackup() {
        return this.routeBackup;
    }

    public DescribeSagECRouteBackupAttributeResponseBody setExpressConnectionNexthop(String expressConnectionNexthop) {
        this.expressConnectionNexthop = expressConnectionNexthop;
        return this;
    }
    public String getExpressConnectionNexthop() {
        return this.expressConnectionNexthop;
    }

    public DescribeSagECRouteBackupAttributeResponseBody setSagId(String sagId) {
        this.sagId = sagId;
        return this;
    }
    public String getSagId() {
        return this.sagId;
    }

    public DescribeSagECRouteBackupAttributeResponseBody setCidrs(DescribeSagECRouteBackupAttributeResponseBodyCidrs cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public DescribeSagECRouteBackupAttributeResponseBodyCidrs getCidrs() {
        return this.cidrs;
    }

    public static class DescribeSagECRouteBackupAttributeResponseBodyCidrsCidr extends TeaModel {
        @NameInMap("EnableBackup")
        public Boolean enableBackup;

        @NameInMap("Cidr")
        public String cidr;

        public static DescribeSagECRouteBackupAttributeResponseBodyCidrsCidr build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagECRouteBackupAttributeResponseBodyCidrsCidr self = new DescribeSagECRouteBackupAttributeResponseBodyCidrsCidr();
            return TeaModel.build(map, self);
        }

        public DescribeSagECRouteBackupAttributeResponseBodyCidrsCidr setEnableBackup(Boolean enableBackup) {
            this.enableBackup = enableBackup;
            return this;
        }
        public Boolean getEnableBackup() {
            return this.enableBackup;
        }

        public DescribeSagECRouteBackupAttributeResponseBodyCidrsCidr setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

    }

    public static class DescribeSagECRouteBackupAttributeResponseBodyCidrs extends TeaModel {
        @NameInMap("Cidr")
        public java.util.List<DescribeSagECRouteBackupAttributeResponseBodyCidrsCidr> cidr;

        public static DescribeSagECRouteBackupAttributeResponseBodyCidrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagECRouteBackupAttributeResponseBodyCidrs self = new DescribeSagECRouteBackupAttributeResponseBodyCidrs();
            return TeaModel.build(map, self);
        }

        public DescribeSagECRouteBackupAttributeResponseBodyCidrs setCidr(java.util.List<DescribeSagECRouteBackupAttributeResponseBodyCidrsCidr> cidr) {
            this.cidr = cidr;
            return this;
        }
        public java.util.List<DescribeSagECRouteBackupAttributeResponseBodyCidrsCidr> getCidr() {
            return this.cidr;
        }

    }

}

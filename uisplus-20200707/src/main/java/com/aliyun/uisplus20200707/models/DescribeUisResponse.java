// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DescribeUisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("UisName")
    @Validation(required = true)
    public String uisName;

    @NameInMap("State")
    @Validation(required = true)
    public String state;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InternetIps")
    @Validation(required = true)
    public java.util.List<DescribeUisResponseInternetIps> internetIps;

    public static DescribeUisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUisResponse self = new DescribeUisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUisResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUisResponse setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public DescribeUisResponse setUisName(String uisName) {
        this.uisName = uisName;
        return this;
    }
    public String getUisName() {
        return this.uisName;
    }

    public DescribeUisResponse setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeUisResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUisResponse setInternetIps(java.util.List<DescribeUisResponseInternetIps> internetIps) {
        this.internetIps = internetIps;
        return this;
    }
    public java.util.List<DescribeUisResponseInternetIps> getInternetIps() {
        return this.internetIps;
    }

    public static class DescribeUisResponseInternetIps extends TeaModel {
        @NameInMap("Ip")
        @Validation(required = true)
        public String ip;

        @NameInMap("Role")
        @Validation(required = true)
        public String role;

        @NameInMap("EipId")
        @Validation(required = true)
        public String eipId;

        public static DescribeUisResponseInternetIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeUisResponseInternetIps self = new DescribeUisResponseInternetIps();
            return TeaModel.build(map, self);
        }

        public DescribeUisResponseInternetIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeUisResponseInternetIps setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeUisResponseInternetIps setEipId(String eipId) {
            this.eipId = eipId;
            return this;
        }
        public String getEipId() {
            return this.eipId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDWSVpcAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateDWSVpcAppResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateDWSVpcAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDWSVpcAppResponseBody self = new CreateDWSVpcAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDWSVpcAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDWSVpcAppResponseBody setData(CreateDWSVpcAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDWSVpcAppResponseBodyData getData() {
        return this.data;
    }

    public CreateDWSVpcAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateDWSVpcAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateDWSVpcAppResponseBodyData extends TeaModel {
        @NameInMap("VpcAddressPoolId")
        public String vpcAddressPoolId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("VpcAddressPool")
        public String vpcAddressPool;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("RegionId")
        public String regionId;

        public static CreateDWSVpcAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDWSVpcAppResponseBodyData self = new CreateDWSVpcAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDWSVpcAppResponseBodyData setVpcAddressPoolId(String vpcAddressPoolId) {
            this.vpcAddressPoolId = vpcAddressPoolId;
            return this;
        }
        public String getVpcAddressPoolId() {
            return this.vpcAddressPoolId;
        }

        public CreateDWSVpcAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateDWSVpcAppResponseBodyData setVpcAddressPool(String vpcAddressPool) {
            this.vpcAddressPool = vpcAddressPool;
            return this;
        }
        public String getVpcAddressPool() {
            return this.vpcAddressPool;
        }

        public CreateDWSVpcAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateDWSVpcAppResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}

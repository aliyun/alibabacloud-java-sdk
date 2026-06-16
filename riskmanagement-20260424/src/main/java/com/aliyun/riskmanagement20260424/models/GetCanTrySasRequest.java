// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetCanTrySasRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SdkRequest")
    public GetCanTrySasRequestSdkRequest sdkRequest;

    public static GetCanTrySasRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCanTrySasRequest self = new GetCanTrySasRequest();
        return TeaModel.build(map, self);
    }

    public GetCanTrySasRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetCanTrySasRequest setSdkRequest(GetCanTrySasRequestSdkRequest sdkRequest) {
        this.sdkRequest = sdkRequest;
        return this;
    }
    public GetCanTrySasRequestSdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static class GetCanTrySasRequestSdkRequest extends TeaModel {
        @NameInMap("FromEcs")
        public Boolean fromEcs;

        @NameInMap("Lang")
        public String lang;

        public static GetCanTrySasRequestSdkRequest build(java.util.Map<String, ?> map) throws Exception {
            GetCanTrySasRequestSdkRequest self = new GetCanTrySasRequestSdkRequest();
            return TeaModel.build(map, self);
        }

        public GetCanTrySasRequestSdkRequest setFromEcs(Boolean fromEcs) {
            this.fromEcs = fromEcs;
            return this;
        }
        public Boolean getFromEcs() {
            return this.fromEcs;
        }

        public GetCanTrySasRequestSdkRequest setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

}

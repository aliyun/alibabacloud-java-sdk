// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetCanTrySasRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-guangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Security Center SDK request parameters.</p>
     */
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
        /**
         * <p>Specifies whether the request is from the ECS console. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is from the ECS console.</li>
         * <li><strong>false</strong>: The request is not from the ECS console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FromEcs")
        public Boolean fromEcs;

        /**
         * <p>The language type for the request and response messages. Default value: zh. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
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

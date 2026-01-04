// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class SwitchActiveRouteTargetRequest extends TeaModel {
    /**
     * <p>Client token, used to ensure the idempotence of the request. Generate a unique value for this parameter from your client to ensure that it is unique across different requests. The ClientToken only supports ASCII characters. Note: If you do not specify this, the system will automatically use the RequestId of the API request as the ClientToken identifier. The RequestId may differ for each API request.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe6****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID where the RouteTargetGroup is located.</p>
     * <p>You can obtain the region ID by calling the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance ID of the RouteTargetGroup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtg-xxxx</p>
     */
    @NameInMap("RouteTargetGroupId")
    public String routeTargetGroupId;

    /**
     * <p>Resource tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<SwitchActiveRouteTargetRequestTag> tag;

    public static SwitchActiveRouteTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchActiveRouteTargetRequest self = new SwitchActiveRouteTargetRequest();
        return TeaModel.build(map, self);
    }

    public SwitchActiveRouteTargetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SwitchActiveRouteTargetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SwitchActiveRouteTargetRequest setRouteTargetGroupId(String routeTargetGroupId) {
        this.routeTargetGroupId = routeTargetGroupId;
        return this;
    }
    public String getRouteTargetGroupId() {
        return this.routeTargetGroupId;
    }

    public SwitchActiveRouteTargetRequest setTag(java.util.List<SwitchActiveRouteTargetRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<SwitchActiveRouteTargetRequestTag> getTag() {
        return this.tag;
    }

    public static class SwitchActiveRouteTargetRequestTag extends TeaModel {
        /**
         * <p>The key of the resource tag. Up to 20 tag keys are supported. If you need to pass this value, you cannot input an empty string.</p>
         * <p>Each tag key can have up to 128 characters and cannot start with <code>aliyun</code> or <code>acs:</code>. It also cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the resource tag. Up to 20 tag values are supported. If you need to pass this value, you can input an empty string. A maximum of 128 characters is allowed. The value cannot start with <code>aliyun</code> or <code>acs:</code>, and it must not contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static SwitchActiveRouteTargetRequestTag build(java.util.Map<String, ?> map) throws Exception {
            SwitchActiveRouteTargetRequestTag self = new SwitchActiveRouteTargetRequestTag();
            return TeaModel.build(map, self);
        }

        public SwitchActiveRouteTargetRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SwitchActiveRouteTargetRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

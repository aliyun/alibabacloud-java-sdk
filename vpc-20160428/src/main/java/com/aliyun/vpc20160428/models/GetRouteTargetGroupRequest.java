// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetRouteTargetGroupRequest extends TeaModel {
    /**
     * <p>Client token, used to ensure idempotence of the request.</p>
     * <p>Generate a parameter value from your client and ensure that it is unique across different requests. ClientToken only supports ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong> identifier. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>ID of the region to which the route target group belongs. You can obtain the region ID by calling the DescribeRegions interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>ID of the route target group member instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtg-xxxx</p>
     */
    @NameInMap("RouteTargetGroupId")
    public String routeTargetGroupId;

    /**
     * <p>Tag information.</p>
     */
    @NameInMap("Tag")
    public java.util.List<GetRouteTargetGroupRequestTag> tag;

    public static GetRouteTargetGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRouteTargetGroupRequest self = new GetRouteTargetGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetRouteTargetGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetRouteTargetGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRouteTargetGroupRequest setRouteTargetGroupId(String routeTargetGroupId) {
        this.routeTargetGroupId = routeTargetGroupId;
        return this;
    }
    public String getRouteTargetGroupId() {
        return this.routeTargetGroupId;
    }

    public GetRouteTargetGroupRequest setTag(java.util.List<GetRouteTargetGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetRouteTargetGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class GetRouteTargetGroupRequestTag extends TeaModel {
        /**
         * <p>Resource tag key. Up to 20 tag keys are supported. If you need to pass this value, you cannot input an empty string.</p>
         * <p>A tag key can have up to 128 characters and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Resource tag value. Up to 20 tag values are supported. If you need to pass this value, you can input an empty string.</p>
         * <p>A tag value can have up to 128 characters and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetRouteTargetGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetRouteTargetGroupRequestTag self = new GetRouteTargetGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public GetRouteTargetGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetRouteTargetGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

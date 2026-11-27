// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteTargetGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, and you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d7d24a21-f4ba-4454-9173-b3****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run without performing the actual operation.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ForceDelete")
    public Boolean forceDelete;

    /**
     * <p>The region ID of the resource group to be modified.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance ID of the routing target group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtg-xxxx</p>
     */
    @NameInMap("RouteTargetGroupId")
    public String routeTargetGroupId;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DeleteRouteTargetGroupRequestTag> tag;

    public static DeleteRouteTargetGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteTargetGroupRequest self = new DeleteRouteTargetGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteTargetGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteRouteTargetGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteRouteTargetGroupRequest setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }
    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    public DeleteRouteTargetGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRouteTargetGroupRequest setRouteTargetGroupId(String routeTargetGroupId) {
        this.routeTargetGroupId = routeTargetGroupId;
        return this;
    }
    public String getRouteTargetGroupId() {
        return this.routeTargetGroupId;
    }

    public DeleteRouteTargetGroupRequest setTag(java.util.List<DeleteRouteTargetGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DeleteRouteTargetGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class DeleteRouteTargetGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. If you specify this parameter, you cannot specify an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. If you specify this parameter, you can specify an empty string.</p>
         * <p>A tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DeleteRouteTargetGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DeleteRouteTargetGroupRequestTag self = new DeleteRouteTargetGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public DeleteRouteTargetGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeleteRouteTargetGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

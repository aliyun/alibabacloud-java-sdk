// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckRuleInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>103784262032****</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    /**
     * <strong>example:</strong>
     * <p>Disk</p>
     */
    @NameInMap("AssetSubType")
    public String assetSubType;

    /**
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("CheckId")
    public String checkId;

    @NameInMap("CheckRuleInstances")
    public java.util.List<ListCheckRuleInstanceResponseBodyCheckRuleInstances> checkRuleInstances;

    /**
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static ListCheckRuleInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckRuleInstanceResponseBody self = new ListCheckRuleInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckRuleInstanceResponseBody setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public ListCheckRuleInstanceResponseBody setAssetSubType(String assetSubType) {
        this.assetSubType = assetSubType;
        return this;
    }
    public String getAssetSubType() {
        return this.assetSubType;
    }

    public ListCheckRuleInstanceResponseBody setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public ListCheckRuleInstanceResponseBody setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public ListCheckRuleInstanceResponseBody setCheckRuleInstances(java.util.List<ListCheckRuleInstanceResponseBodyCheckRuleInstances> checkRuleInstances) {
        this.checkRuleInstances = checkRuleInstances;
        return this;
    }
    public java.util.List<ListCheckRuleInstanceResponseBodyCheckRuleInstances> getCheckRuleInstances() {
        return this.checkRuleInstances;
    }

    public ListCheckRuleInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCheckRuleInstanceResponseBody setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public static class ListCheckRuleInstanceResponseBodyCheckRuleInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-j6c76lh1kvrcvwl*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>testEcs</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListCheckRuleInstanceResponseBodyCheckRuleInstances build(java.util.Map<String, ?> map) throws Exception {
            ListCheckRuleInstanceResponseBodyCheckRuleInstances self = new ListCheckRuleInstanceResponseBodyCheckRuleInstances();
            return TeaModel.build(map, self);
        }

        public ListCheckRuleInstanceResponseBodyCheckRuleInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCheckRuleInstanceResponseBodyCheckRuleInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListCheckRuleInstanceResponseBodyCheckRuleInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}

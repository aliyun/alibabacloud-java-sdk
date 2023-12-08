// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class CreateNetworkReachableAnalysisRequest extends TeaModel {
    /**
     * <p>The ID of the network path. You can call the **CreateNetworkPath** operation to obtain the ID of the network path.</p>
     */
    @NameInMap("NetworkPathId")
    public String networkPathId;

    /**
     * <p>The ID of the region for which you want to create a task for analyzing network reachability.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags to add to the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateNetworkReachableAnalysisRequestTag> tag;

    public static CreateNetworkReachableAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkReachableAnalysisRequest self = new CreateNetworkReachableAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkReachableAnalysisRequest setNetworkPathId(String networkPathId) {
        this.networkPathId = networkPathId;
        return this;
    }
    public String getNetworkPathId() {
        return this.networkPathId;
    }

    public CreateNetworkReachableAnalysisRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNetworkReachableAnalysisRequest setTag(java.util.List<CreateNetworkReachableAnalysisRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateNetworkReachableAnalysisRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateNetworkReachableAnalysisRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the resource. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.</p>
         * <br>
         * <p>You can add up to 20 tags in each call.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateNetworkReachableAnalysisRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkReachableAnalysisRequestTag self = new CreateNetworkReachableAnalysisRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateNetworkReachableAnalysisRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateNetworkReachableAnalysisRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

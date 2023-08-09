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
        @NameInMap("Key")
        public String key;

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

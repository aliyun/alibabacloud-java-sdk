// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20260603.models;

import com.aliyun.tea.*;

public class ListModelDeploymentProfilesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>model-6wiou4ta20tgtq9lda</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("Profiles")
    public java.util.List<ListModelDeploymentProfilesResponseBodyProfiles> profiles;

    /**
     * <strong>example:</strong>
     * <p>B6B54325-C98C-5937-87A3-2F96C07652EC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListModelDeploymentProfilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelDeploymentProfilesResponseBody self = new ListModelDeploymentProfilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelDeploymentProfilesResponseBody setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public ListModelDeploymentProfilesResponseBody setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public ListModelDeploymentProfilesResponseBody setProfiles(java.util.List<ListModelDeploymentProfilesResponseBodyProfiles> profiles) {
        this.profiles = profiles;
        return this;
    }
    public java.util.List<ListModelDeploymentProfilesResponseBodyProfiles> getProfiles() {
        return this.profiles;
    }

    public ListModelDeploymentProfilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelDeploymentProfilesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelDeploymentProfilesResponseBodyProfilesDevices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NVIDIA</p>
         */
        @NameInMap("DeviceCategory")
        public String deviceCategory;

        /**
         * <strong>example:</strong>
         * <p>NVIDIA_L20C</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <strong>example:</strong>
         * <p>L20C</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        public static ListModelDeploymentProfilesResponseBodyProfilesDevices build(java.util.Map<String, ?> map) throws Exception {
            ListModelDeploymentProfilesResponseBodyProfilesDevices self = new ListModelDeploymentProfilesResponseBodyProfilesDevices();
            return TeaModel.build(map, self);
        }

        public ListModelDeploymentProfilesResponseBodyProfilesDevices setDeviceCategory(String deviceCategory) {
            this.deviceCategory = deviceCategory;
            return this;
        }
        public String getDeviceCategory() {
            return this.deviceCategory;
        }

        public ListModelDeploymentProfilesResponseBodyProfilesDevices setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListModelDeploymentProfilesResponseBodyProfilesDevices setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListModelDeploymentProfilesResponseBodyProfilesDevices setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

    }

    public static class ListModelDeploymentProfilesResponseBodyProfilesMembers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        /**
         * <strong>example:</strong>
         * <p>{ &quot;script&quot;: &quot;sglang serve --disaggregation-mode decode&quot; }</p>
         */
        @NameInMap("Meta")
        public java.util.Map<String, ?> meta;

        public static ListModelDeploymentProfilesResponseBodyProfilesMembers build(java.util.Map<String, ?> map) throws Exception {
            ListModelDeploymentProfilesResponseBodyProfilesMembers self = new ListModelDeploymentProfilesResponseBodyProfilesMembers();
            return TeaModel.build(map, self);
        }

        public ListModelDeploymentProfilesResponseBodyProfilesMembers setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

        public ListModelDeploymentProfilesResponseBodyProfilesMembers setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

    }

    public static class ListModelDeploymentProfilesResponseBodyProfiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>singlenode</p>
         */
        @NameInMap("Category")
        public String category;

        @NameInMap("Devices")
        public java.util.List<ListModelDeploymentProfilesResponseBodyProfilesDevices> devices;

        /**
         * <strong>example:</strong>
         * <p>sglang</p>
         */
        @NameInMap("Framework")
        public String framework;

        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        @NameInMap("Members")
        public java.util.List<ListModelDeploymentProfilesResponseBodyProfilesMembers> members;

        @NameInMap("Optimizations")
        public java.util.Map<String, String> optimizations;

        /**
         * <strong>example:</strong>
         * <p>prf_4f73b31ae****23f9a04c6e83ebc78f</p>
         */
        @NameInMap("ProfileId")
        public String profileId;

        /**
         * <strong>example:</strong>
         * <p>singlenode-balanced</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        public static ListModelDeploymentProfilesResponseBodyProfiles build(java.util.Map<String, ?> map) throws Exception {
            ListModelDeploymentProfilesResponseBodyProfiles self = new ListModelDeploymentProfilesResponseBodyProfiles();
            return TeaModel.build(map, self);
        }

        public ListModelDeploymentProfilesResponseBodyProfiles setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListModelDeploymentProfilesResponseBodyProfiles setDevices(java.util.List<ListModelDeploymentProfilesResponseBodyProfilesDevices> devices) {
            this.devices = devices;
            return this;
        }
        public java.util.List<ListModelDeploymentProfilesResponseBodyProfilesDevices> getDevices() {
            return this.devices;
        }

        public ListModelDeploymentProfilesResponseBodyProfiles setFramework(String framework) {
            this.framework = framework;
            return this;
        }
        public String getFramework() {
            return this.framework;
        }

        public ListModelDeploymentProfilesResponseBodyProfiles setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListModelDeploymentProfilesResponseBodyProfiles setMembers(java.util.List<ListModelDeploymentProfilesResponseBodyProfilesMembers> members) {
            this.members = members;
            return this;
        }
        public java.util.List<ListModelDeploymentProfilesResponseBodyProfilesMembers> getMembers() {
            return this.members;
        }

        public ListModelDeploymentProfilesResponseBodyProfiles setOptimizations(java.util.Map<String, String> optimizations) {
            this.optimizations = optimizations;
            return this;
        }
        public java.util.Map<String, String> getOptimizations() {
            return this.optimizations;
        }

        public ListModelDeploymentProfilesResponseBodyProfiles setProfileId(String profileId) {
            this.profileId = profileId;
            return this;
        }
        public String getProfileId() {
            return this.profileId;
        }

        public ListModelDeploymentProfilesResponseBodyProfiles setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

    }

}

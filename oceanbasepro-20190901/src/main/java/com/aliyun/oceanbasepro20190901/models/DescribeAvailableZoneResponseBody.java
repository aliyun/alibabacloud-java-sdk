// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableZoneResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAvailableZoneResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableZoneResponseBody self = new DescribeAvailableZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableZoneResponseBody setData(DescribeAvailableZoneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAvailableZoneResponseBodyData getData() {
        return this.data;
    }

    public DescribeAvailableZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsDiskSizeRange extends TeaModel {
        @NameInMap("Max")
        public Long max;

        @NameInMap("Min")
        public Long min;

        @NameInMap("Step")
        public Long step;

        public static DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsDiskSizeRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsDiskSizeRange self = new DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsDiskSizeRange();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsDiskSizeRange setMax(Long max) {
            this.max = max;
            return this;
        }
        public Long getMax() {
            return this.max;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsDiskSizeRange setMin(Long min) {
            this.min = min;
            return this;
        }
        public Long getMin() {
            return this.min;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsDiskSizeRange setStep(Long step) {
            this.step = step;
            return this;
        }
        public Long getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsSupportEngineVersions extends TeaModel {
        @NameInMap("ObVersion")
        public String obVersion;

        @NameInMap("SupportIsolationOptimization")
        public Boolean supportIsolationOptimization;

        @NameInMap("SupportReplicaModes")
        public java.util.List<String> supportReplicaModes;

        public static DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsSupportEngineVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsSupportEngineVersions self = new DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsSupportEngineVersions();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsSupportEngineVersions setObVersion(String obVersion) {
            this.obVersion = obVersion;
            return this;
        }
        public String getObVersion() {
            return this.obVersion;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsSupportEngineVersions setSupportIsolationOptimization(Boolean supportIsolationOptimization) {
            this.supportIsolationOptimization = supportIsolationOptimization;
            return this;
        }
        public Boolean getSupportIsolationOptimization() {
            return this.supportIsolationOptimization;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsSupportEngineVersions setSupportReplicaModes(java.util.List<String> supportReplicaModes) {
            this.supportReplicaModes = supportReplicaModes;
            return this;
        }
        public java.util.List<String> getSupportReplicaModes() {
            return this.supportReplicaModes;
        }

    }

    public static class DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecifications extends TeaModel {
        @NameInMap("DiskSizeRange")
        public DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsDiskSizeRange diskSizeRange;

        @NameInMap("DiskTypes")
        public java.util.List<String> diskTypes;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("SupportEngineVersions")
        public java.util.List<DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsSupportEngineVersions> supportEngineVersions;

        public static DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecifications build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecifications self = new DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecifications();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecifications setDiskSizeRange(DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsDiskSizeRange diskSizeRange) {
            this.diskSizeRange = diskSizeRange;
            return this;
        }
        public DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsDiskSizeRange getDiskSizeRange() {
            return this.diskSizeRange;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecifications setDiskTypes(java.util.List<String> diskTypes) {
            this.diskTypes = diskTypes;
            return this;
        }
        public java.util.List<String> getDiskTypes() {
            return this.diskTypes;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecifications setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecifications setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecifications setSupportEngineVersions(java.util.List<DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsSupportEngineVersions> supportEngineVersions) {
            this.supportEngineVersions = supportEngineVersions;
            return this;
        }
        public java.util.List<DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecificationsSupportEngineVersions> getSupportEngineVersions() {
            return this.supportEngineVersions;
        }

    }

    public static class DescribeAvailableZoneResponseBodyDataAvailableZones extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        @NameInMap("CpuArch")
        public String cpuArch;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Region")
        public String region;

        @NameInMap("Series")
        public String series;

        @NameInMap("SupportSpecifications")
        public java.util.List<DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecifications> supportSpecifications;

        @NameInMap("Zones")
        public String zones;

        public static DescribeAvailableZoneResponseBodyDataAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZoneResponseBodyDataAvailableZones self = new DescribeAvailableZoneResponseBodyDataAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZones setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZones setCpuArch(String cpuArch) {
            this.cpuArch = cpuArch;
            return this;
        }
        public String getCpuArch() {
            return this.cpuArch;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZones setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZones setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZones setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZones setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZones setSupportSpecifications(java.util.List<DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecifications> supportSpecifications) {
            this.supportSpecifications = supportSpecifications;
            return this;
        }
        public java.util.List<DescribeAvailableZoneResponseBodyDataAvailableZonesSupportSpecifications> getSupportSpecifications() {
            return this.supportSpecifications;
        }

        public DescribeAvailableZoneResponseBodyDataAvailableZones setZones(String zones) {
            this.zones = zones;
            return this;
        }
        public String getZones() {
            return this.zones;
        }

    }

    public static class DescribeAvailableZoneResponseBodyData extends TeaModel {
        @NameInMap("AvailableZones")
        public java.util.List<DescribeAvailableZoneResponseBodyDataAvailableZones> availableZones;

        public static DescribeAvailableZoneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZoneResponseBodyData self = new DescribeAvailableZoneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZoneResponseBodyData setAvailableZones(java.util.List<DescribeAvailableZoneResponseBodyDataAvailableZones> availableZones) {
            this.availableZones = availableZones;
            return this;
        }
        public java.util.List<DescribeAvailableZoneResponseBodyDataAvailableZones> getAvailableZones() {
            return this.availableZones;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AvailableResources")
    public java.util.List<DescribeAvailableResourceResponseBodyAvailableResources> availableResources;

    public static DescribeAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponseBody self = new DescribeAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableResourceResponseBody setAvailableResources(java.util.List<DescribeAvailableResourceResponseBodyAvailableResources> availableResources) {
        this.availableResources = availableResources;
        return this;
    }
    public java.util.List<DescribeAvailableResourceResponseBodyAvailableResources> getAvailableResources() {
        return this.availableResources;
    }

    public static class DescribeAvailableResourceResponseBodyAvailableResourcesSupportResources extends TeaModel {
        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        @NameInMap("AddressType")
        public String addressType;

        public static DescribeAvailableResourceResponseBodyAvailableResourcesSupportResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableResourcesSupportResources self = new DescribeAvailableResourceResponseBodyAvailableResourcesSupportResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableResourcesSupportResources setAddressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        public DescribeAvailableResourceResponseBodyAvailableResourcesSupportResources setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableResources extends TeaModel {
        @NameInMap("SlaveZoneId")
        public String slaveZoneId;

        @NameInMap("SupportResources")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableResourcesSupportResources> supportResources;

        @NameInMap("MasterZoneId")
        public String masterZoneId;

        public static DescribeAvailableResourceResponseBodyAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableResources self = new DescribeAvailableResourceResponseBodyAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableResources setSlaveZoneId(String slaveZoneId) {
            this.slaveZoneId = slaveZoneId;
            return this;
        }
        public String getSlaveZoneId() {
            return this.slaveZoneId;
        }

        public DescribeAvailableResourceResponseBodyAvailableResources setSupportResources(java.util.List<DescribeAvailableResourceResponseBodyAvailableResourcesSupportResources> supportResources) {
            this.supportResources = supportResources;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableResourcesSupportResources> getSupportResources() {
            return this.supportResources;
        }

        public DescribeAvailableResourceResponseBodyAvailableResources setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableDedicatedHostClassesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("HostClasses")
    @Validation(required = true)
    public DescribeAvailableDedicatedHostClassesResponseHostClasses hostClasses;

    public static DescribeAvailableDedicatedHostClassesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableDedicatedHostClassesResponse self = new DescribeAvailableDedicatedHostClassesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableDedicatedHostClassesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableDedicatedHostClassesResponse setHostClasses(DescribeAvailableDedicatedHostClassesResponseHostClasses hostClasses) {
        this.hostClasses = hostClasses;
        return this;
    }
    public DescribeAvailableDedicatedHostClassesResponseHostClasses getHostClasses() {
        return this.hostClasses;
    }

    public static class DescribeAvailableDedicatedHostClassesResponseHostClassesHostClasses extends TeaModel {
        @NameInMap("HostClassName")
        @Validation(required = true)
        public String hostClassName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeAvailableDedicatedHostClassesResponseHostClassesHostClasses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableDedicatedHostClassesResponseHostClassesHostClasses self = new DescribeAvailableDedicatedHostClassesResponseHostClassesHostClasses();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableDedicatedHostClassesResponseHostClassesHostClasses setHostClassName(String hostClassName) {
            this.hostClassName = hostClassName;
            return this;
        }
        public String getHostClassName() {
            return this.hostClassName;
        }

        public DescribeAvailableDedicatedHostClassesResponseHostClassesHostClasses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeAvailableDedicatedHostClassesResponseHostClasses extends TeaModel {
        @NameInMap("HostClasses")
        @Validation(required = true)
        public java.util.List<DescribeAvailableDedicatedHostClassesResponseHostClassesHostClasses> hostClasses;

        public static DescribeAvailableDedicatedHostClassesResponseHostClasses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableDedicatedHostClassesResponseHostClasses self = new DescribeAvailableDedicatedHostClassesResponseHostClasses();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableDedicatedHostClassesResponseHostClasses setHostClasses(java.util.List<DescribeAvailableDedicatedHostClassesResponseHostClassesHostClasses> hostClasses) {
            this.hostClasses = hostClasses;
            return this;
        }
        public java.util.List<DescribeAvailableDedicatedHostClassesResponseHostClassesHostClasses> getHostClasses() {
            return this.hostClasses;
        }

    }

}

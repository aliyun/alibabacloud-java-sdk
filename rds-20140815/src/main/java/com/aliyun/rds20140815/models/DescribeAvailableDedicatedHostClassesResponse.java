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

    }

    public static class DescribeAvailableDedicatedHostClassesResponseHostClasses extends TeaModel {
        @NameInMap("HostClasses")
        @Validation(required = true)
        public java.util.List<DescribeAvailableDedicatedHostClassesResponseHostClassesHostClasses> hostClasses;

        public static DescribeAvailableDedicatedHostClassesResponseHostClasses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableDedicatedHostClassesResponseHostClasses self = new DescribeAvailableDedicatedHostClassesResponseHostClasses();
            return TeaModel.build(map, self);
        }

    }

}

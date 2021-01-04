// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribePbrInterfacesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PbrInterfaces")
    public DescribePbrInterfacesResponseBodyPbrInterfaces pbrInterfaces;

    public static DescribePbrInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePbrInterfacesResponseBody self = new DescribePbrInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePbrInterfacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePbrInterfacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePbrInterfacesResponseBody setPbrInterfaces(DescribePbrInterfacesResponseBodyPbrInterfaces pbrInterfaces) {
        this.pbrInterfaces = pbrInterfaces;
        return this;
    }
    public DescribePbrInterfacesResponseBodyPbrInterfaces getPbrInterfaces() {
        return this.pbrInterfaces;
    }

    public static class DescribePbrInterfacesResponseBodyPbrInterfacesPbrInterface extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("InterfaceName")
        public String interfaceName;

        @NameInMap("HealthCheckInstanceId")
        public String healthCheckInstanceId;

        @NameInMap("Priority")
        public Integer priority;

        public static DescribePbrInterfacesResponseBodyPbrInterfacesPbrInterface build(java.util.Map<String, ?> map) throws Exception {
            DescribePbrInterfacesResponseBodyPbrInterfacesPbrInterface self = new DescribePbrInterfacesResponseBodyPbrInterfacesPbrInterface();
            return TeaModel.build(map, self);
        }

        public DescribePbrInterfacesResponseBodyPbrInterfacesPbrInterface setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribePbrInterfacesResponseBodyPbrInterfacesPbrInterface setInterfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
            return this;
        }
        public String getInterfaceName() {
            return this.interfaceName;
        }

        public DescribePbrInterfacesResponseBodyPbrInterfacesPbrInterface setHealthCheckInstanceId(String healthCheckInstanceId) {
            this.healthCheckInstanceId = healthCheckInstanceId;
            return this;
        }
        public String getHealthCheckInstanceId() {
            return this.healthCheckInstanceId;
        }

        public DescribePbrInterfacesResponseBodyPbrInterfacesPbrInterface setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class DescribePbrInterfacesResponseBodyPbrInterfaces extends TeaModel {
        @NameInMap("PbrInterface")
        public java.util.List<DescribePbrInterfacesResponseBodyPbrInterfacesPbrInterface> pbrInterface;

        public static DescribePbrInterfacesResponseBodyPbrInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribePbrInterfacesResponseBodyPbrInterfaces self = new DescribePbrInterfacesResponseBodyPbrInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribePbrInterfacesResponseBodyPbrInterfaces setPbrInterface(java.util.List<DescribePbrInterfacesResponseBodyPbrInterfacesPbrInterface> pbrInterface) {
            this.pbrInterface = pbrInterface;
            return this;
        }
        public java.util.List<DescribePbrInterfacesResponseBodyPbrInterfacesPbrInterface> getPbrInterface() {
            return this.pbrInterface;
        }

    }

}

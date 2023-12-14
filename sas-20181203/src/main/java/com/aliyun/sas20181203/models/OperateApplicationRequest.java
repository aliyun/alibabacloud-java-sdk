// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateApplicationRequest extends TeaModel {
    /**
     * <p>The container application that is protected from being tampered with.</p>
     */
    @NameInMap("ContainerWebDefenseApplicationDTOS")
    public java.util.List<OperateApplicationRequestContainerWebDefenseApplicationDTOS> containerWebDefenseApplicationDTOS;

    /**
     * <p>The ID of the rule.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static OperateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateApplicationRequest self = new OperateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public OperateApplicationRequest setContainerWebDefenseApplicationDTOS(java.util.List<OperateApplicationRequestContainerWebDefenseApplicationDTOS> containerWebDefenseApplicationDTOS) {
        this.containerWebDefenseApplicationDTOS = containerWebDefenseApplicationDTOS;
        return this;
    }
    public java.util.List<OperateApplicationRequestContainerWebDefenseApplicationDTOS> getContainerWebDefenseApplicationDTOS() {
        return this.containerWebDefenseApplicationDTOS;
    }

    public OperateApplicationRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public static class OperateApplicationRequestContainerWebDefenseApplicationDTOS extends TeaModel {
        /**
         * <p>The ID of the cluster to which the container belongs.</p>
         * <br>
         * <p>>  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the cluster ID.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>Specifies whether to apply the configuration to the asset. Valid values:</p>
         * <br>
         * <p>*   **add**: applied</p>
         * <p>*   **del**: not applied</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <p>The application ID. If the application is newly added, you do not need to specify this parameter.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The value of the application tag.</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static OperateApplicationRequestContainerWebDefenseApplicationDTOS build(java.util.Map<String, ?> map) throws Exception {
            OperateApplicationRequestContainerWebDefenseApplicationDTOS self = new OperateApplicationRequestContainerWebDefenseApplicationDTOS();
            return TeaModel.build(map, self);
        }

        public OperateApplicationRequestContainerWebDefenseApplicationDTOS setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public OperateApplicationRequestContainerWebDefenseApplicationDTOS setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public OperateApplicationRequestContainerWebDefenseApplicationDTOS setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public OperateApplicationRequestContainerWebDefenseApplicationDTOS setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateApplicationRequest extends TeaModel {
    @NameInMap("ContainerWebDefenseApplicationDTOS")
    public java.util.List<OperateApplicationRequestContainerWebDefenseApplicationDTOS> containerWebDefenseApplicationDTOS;

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
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Flag")
        public String flag;

        @NameInMap("Id")
        public Long id;

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

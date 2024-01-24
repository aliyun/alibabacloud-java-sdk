// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupMachineGroupRequest extends TeaModel {
    @NameInMap("Tag")
    public java.util.List<GetResourceGroupMachineGroupRequestTag> tag;

    public static GetResourceGroupMachineGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupMachineGroupRequest self = new GetResourceGroupMachineGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupMachineGroupRequest setTag(java.util.List<GetResourceGroupMachineGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetResourceGroupMachineGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class GetResourceGroupMachineGroupRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetResourceGroupMachineGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupMachineGroupRequestTag self = new GetResourceGroupMachineGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupMachineGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetResourceGroupMachineGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

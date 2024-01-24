// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupRequest extends TeaModel {
    @NameInMap("IsAIWorkspaceDataEnabled")
    public Boolean isAIWorkspaceDataEnabled;

    @NameInMap("Tag")
    public java.util.List<GetResourceGroupRequestTag> tag;

    public static GetResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupRequest self = new GetResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupRequest setIsAIWorkspaceDataEnabled(Boolean isAIWorkspaceDataEnabled) {
        this.isAIWorkspaceDataEnabled = isAIWorkspaceDataEnabled;
        return this;
    }
    public Boolean getIsAIWorkspaceDataEnabled() {
        return this.isAIWorkspaceDataEnabled;
    }

    public GetResourceGroupRequest setTag(java.util.List<GetResourceGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetResourceGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class GetResourceGroupRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetResourceGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupRequestTag self = new GetResourceGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetResourceGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

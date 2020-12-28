// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupListRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("Tag")
    public java.util.List<OnsGroupListRequestTag> tag;

    public static OnsGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupListRequest self = new OnsGroupListRequest();
        return TeaModel.build(map, self);
    }

    public OnsGroupListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsGroupListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsGroupListRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public OnsGroupListRequest setTag(java.util.List<OnsGroupListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<OnsGroupListRequestTag> getTag() {
        return this.tag;
    }

    public static class OnsGroupListRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static OnsGroupListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            OnsGroupListRequestTag self = new OnsGroupListRequestTag();
            return TeaModel.build(map, self);
        }

        public OnsGroupListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public OnsGroupListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSDdcsAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Attribute")
    public AddMSDdcsAttributesResponseBodyAttribute attribute;

    public static AddMSDdcsAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMSDdcsAttributesResponseBody self = new AddMSDdcsAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMSDdcsAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMSDdcsAttributesResponseBody setAttribute(AddMSDdcsAttributesResponseBodyAttribute attribute) {
        this.attribute = attribute;
        return this;
    }
    public AddMSDdcsAttributesResponseBodyAttribute getAttribute() {
        return this.attribute;
    }

    public static class AddMSDdcsAttributesResponseBodyAttribute extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Desc")
        public String desc;

        public static AddMSDdcsAttributesResponseBodyAttribute build(java.util.Map<String, ?> map) throws Exception {
            AddMSDdcsAttributesResponseBodyAttribute self = new AddMSDdcsAttributesResponseBodyAttribute();
            return TeaModel.build(map, self);
        }

        public AddMSDdcsAttributesResponseBodyAttribute setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public AddMSDdcsAttributesResponseBodyAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddMSDdcsAttributesResponseBodyAttribute setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public AddMSDdcsAttributesResponseBodyAttribute setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

}

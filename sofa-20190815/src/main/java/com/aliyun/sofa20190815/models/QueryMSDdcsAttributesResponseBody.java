// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Attribute")
    public QueryMSDdcsAttributesResponseBodyAttribute attribute;

    public static QueryMSDdcsAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsAttributesResponseBody self = new QueryMSDdcsAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMSDdcsAttributesResponseBody setAttribute(QueryMSDdcsAttributesResponseBodyAttribute attribute) {
        this.attribute = attribute;
        return this;
    }
    public QueryMSDdcsAttributesResponseBodyAttribute getAttribute() {
        return this.attribute;
    }

    public static class QueryMSDdcsAttributesResponseBodyAttribute extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("InstanceId")
        public String instanceId;

        public static QueryMSDdcsAttributesResponseBodyAttribute build(java.util.Map<String, ?> map) throws Exception {
            QueryMSDdcsAttributesResponseBodyAttribute self = new QueryMSDdcsAttributesResponseBodyAttribute();
            return TeaModel.build(map, self);
        }

        public QueryMSDdcsAttributesResponseBodyAttribute setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public QueryMSDdcsAttributesResponseBodyAttribute setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryMSDdcsAttributesResponseBodyAttribute setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public QueryMSDdcsAttributesResponseBodyAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
